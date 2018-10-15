package vision.genesis.clientapp.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import butterknife.BindView;
import butterknife.ButterKnife;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.utils.ImageUtils;
import vision.genesis.clientapp.utils.ThemeUtil;
import vision.genesis.clientapp.utils.TypefaceUtil;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 28/08/2018.
 */

public class ProgramLogoView extends RelativeLayout
{
	@BindView(R.id.image)
	public SimpleDraweeView image;

	@BindView(R.id.level)
	public TextView level;

	@BindView(R.id.level_background)
	public ImageView levelBackground;

	@BindView(R.id.level_color)
	public ImageView levelColor;

	@BindView(R.id.group_level)
	public ViewGroup groupLevel;

	public ProgramLogoView(Context context) {
		super(context);
		initView();
	}

	public ProgramLogoView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public ProgramLogoView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	private void initView() {
		inflate(getContext(), R.layout.view_program_logo, this);

		ButterKnife.bind(this);

		level.setTypeface(TypefaceUtil.semibold());
	}

	public void setImage(String imageId, int width, int height) {
		if (imageId == null || imageId.isEmpty()) {
			image.setImageURI("");
			return;
		}

		ImageRequest request = ImageRequestBuilder.newBuilderWithSource(Uri.parse(ImageUtils.getImageUri(imageId)))
				.setResizeOptions(new ResizeOptions(width, height))
				.build();

		PipelineDraweeController controller = (PipelineDraweeController) Fresco.newDraweeControllerBuilder()
				.setOldController(image.getController())
				.setImageRequest(request)
				.build();

		image.setController(controller);
	}

	public void setLevel(int level) {
		this.level.setText(String.valueOf(level));

		//TODO: change color depending on level
		levelColor.setColorFilter(ThemeUtil.getColorByAttrId(getContext(), R.attr.colorAccent));
	}

	public void setLevelBackground(int colorResId) {
		levelBackground.setColorFilter(ThemeUtil.getColorByAttrId(getContext(), colorResId));
	}

	public void hideLevel() {
		groupLevel.setVisibility(View.GONE);
		LayoutParams lp = (LayoutParams) image.getLayoutParams();
		lp.setMargins(0, 0, 0, 0);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
			lp.setMarginEnd(0);
		}
		image.setLayoutParams(lp);
	}
}
