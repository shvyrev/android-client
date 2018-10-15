package vision.genesis.clientapp.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.swagger.client.api.InvestorApi;
import io.swagger.client.api.ManagersApi;
import io.swagger.client.api.ProgramsApi;
import io.swagger.client.api.RateApi;
import io.swagger.client.api.WalletApi;
import vision.genesis.clientapp.managers.InvestorDashboardManager;
import vision.genesis.clientapp.managers.ManagerDashboardManager;
import vision.genesis.clientapp.managers.ManagersManager;
import vision.genesis.clientapp.managers.ProgramsManager;
import vision.genesis.clientapp.managers.RateManager;
import vision.genesis.clientapp.managers.WalletManager;

/**
 * GenesisVision
 * Created by Vitaly on 1/24/18.
 */

@Module
public class AssetsModule
{
	@Provides
	@Singleton
	public InvestorDashboardManager provideInvestorDashboardManager(InvestorApi investorApi) {
		return new InvestorDashboardManager(investorApi);
	}

	@Provides
	@Singleton
	public ManagerDashboardManager provideManagerDashboardManager(ManagersApi managersApi) {
		return new ManagerDashboardManager(managersApi);
	}

	@Provides
	@Singleton
	public ProgramsManager provideProgramsManager(InvestorApi investorApi, ProgramsApi programApi) {
		return new ProgramsManager(investorApi, programApi);
	}

	@Provides
	@Singleton
	public ManagersManager provideManagersManager(ManagersApi managersApi) {
		return new ManagersManager(managersApi);
	}

	@Provides
	@Singleton
	public WalletManager provideWalletManager(WalletApi walletApi) {
		return new WalletManager(walletApi);
	}

	@Provides
	@Singleton
	public RateManager provideRateManager(RateApi rateApi) {
		return new RateManager(rateApi);
	}
}
