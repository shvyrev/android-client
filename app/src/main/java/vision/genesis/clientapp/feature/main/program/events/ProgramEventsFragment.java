package vision.genesis.clientapp.feature.main.program.events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.List;
import java.util.UUID;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import timber.log.Timber;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.BaseFragment;
import vision.genesis.clientapp.feature.common.date_range.DateRangeBottomSheetFragment;
import vision.genesis.clientapp.feature.main.portfolio_events.PortfolioEventsListAdapter;
import vision.genesis.clientapp.feature.main.program.ProgramDetailsPagerAdapter;
import vision.genesis.clientapp.model.DateRange;
import vision.genesis.clientapp.model.PortfolioEvent;
import vision.genesis.clientapp.ui.DateRangeView;
import vision.genesis.clientapp.ui.common.SimpleSectionedRecyclerViewAdapter;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 03/10/2018.
 */

public class ProgramEventsFragment extends BaseFragment implements ProgramEventsView, ProgramDetailsPagerAdapter.OnPageVisibilityChanged
{
	private static final String EXTRA_PROGRAM_ID = "extra_program_id";

	public static ProgramEventsFragment with(UUID programId) {
		ProgramEventsFragment programEventsFragment = new ProgramEventsFragment();
		Bundle arguments = new Bundle(1);
		arguments.putSerializable(EXTRA_PROGRAM_ID, programId);
		programEventsFragment.setArguments(arguments);
		return programEventsFragment;
	}

	@BindView(R.id.root)
	public ViewGroup root;

	@BindView(R.id.progress_bar)
	public ProgressBar progressBar;

	@BindView(R.id.date_range)
	public DateRangeView dateRangeView;

	@BindView(R.id.group_no_events)
	public View groupNoEvents;

	@BindView(R.id.recycler_view)
	public RecyclerView recyclerView;

	@BindDimen(R.dimen.date_range_margin_bottom)
	public int dateRangeMarginBottom;

	@InjectPresenter
	public ProgramEventsPresenter programEventsPresenter;

	private PortfolioEventsListAdapter eventsListAdapter;

	private SimpleSectionedRecyclerViewAdapter sectionedAdapter;

	private Unbinder unbinder;

	private DateRange dateRange = DateRange.createFromEnum(DateRange.DateRangeEnum.WEEK);

	@OnClick(R.id.date_range)
	public void onDateRangeClicked() {
		if (getActivity() != null) {
			DateRangeBottomSheetFragment bottomSheetDialog = new DateRangeBottomSheetFragment();
			bottomSheetDialog.show(getActivity().getSupportFragmentManager(), bottomSheetDialog.getTag());
			bottomSheetDialog.setDateRange(dateRange);
			bottomSheetDialog.setListener(programEventsPresenter);
		}
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_program_events, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		unbinder = ButterKnife.bind(this, view);

		initRecyclerView();
		setFonts();

		if (getArguments() != null) {
			programEventsPresenter.setProgramId((UUID) getArguments().getSerializable(EXTRA_PROGRAM_ID));
		}
		else {
			Timber.e("Passed empty programId to ProgramEventsFragment");
			onBackPressed();
		}
	}

	@Override
	public void onDestroyView() {
		if (unbinder != null) {
			unbinder.unbind();
			unbinder = null;
		}

		super.onDestroyView();
	}

	private void setFonts() {
	}

	private void initRecyclerView() {
		LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
		recyclerView.setLayoutManager(layoutManager);

		eventsListAdapter = new PortfolioEventsListAdapter();
		sectionedAdapter = new SimpleSectionedRecyclerViewAdapter(getContext(), R.layout.list_item_trades_date_section, R.id.text, eventsListAdapter);
		recyclerView.setAdapter(sectionedAdapter);

		recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener()
		{
			@Override
			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
				LinearLayoutManager layoutManager = LinearLayoutManager.class.cast(recyclerView.getLayoutManager());
				int totalItemCount = layoutManager.getItemCount();
				int lastVisible = layoutManager.findLastCompletelyVisibleItemPosition();

				boolean endHasBeenReached = lastVisible + 1 >= totalItemCount;
				if (totalItemCount > 0 && endHasBeenReached) {
					programEventsPresenter.onLastListItemVisible();
				}
			}
		});
	}

	@Override
	public void showProgress(boolean show) {
		progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
		if (!show) {
			dateRangeView.setVisibility(View.VISIBLE);
			recyclerView.setVisibility(View.VISIBLE);
		}
	}

	@Override
	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
		dateRangeView.setDateRange(dateRange);
	}

	@Override
	public void setEvents(List<PortfolioEvent> events, List<SimpleSectionedRecyclerViewAdapter.Section> sections) {
		if (events.isEmpty()) {
			groupNoEvents.setVisibility(View.VISIBLE);
			recyclerView.setVisibility(View.GONE);
			return;
		}

		sectionedAdapter.setSections(sections);
		eventsListAdapter.setEvents(events);
		groupNoEvents.setVisibility(View.GONE);
		recyclerView.setVisibility(View.VISIBLE);
	}

	@Override
	public void addEvents(List<PortfolioEvent> trades, List<SimpleSectionedRecyclerViewAdapter.Section> sections) {
		sectionedAdapter.setSections(sections);
		eventsListAdapter.addEvents(trades);
	}

	@Override
	public void showSnackbarMessage(String message) {
		showSnackbar(message, recyclerView);
	}

	@Override
	public void pagerShow() {
		if (programEventsPresenter != null)
			programEventsPresenter.onShow();
	}

	@Override
	public void pagerHide() {
	}

	public void onSwipeRefresh() {
		if (programEventsPresenter != null)
			programEventsPresenter.onSwipeRefresh();
	}

	public void onOffsetChanged(int verticalOffset) {
		if (dateRangeView != null)
			dateRangeView.setY(root.getHeight() - verticalOffset - dateRangeView.getHeight() - dateRangeMarginBottom);
	}
}