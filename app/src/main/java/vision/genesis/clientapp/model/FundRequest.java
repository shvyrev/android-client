package vision.genesis.clientapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

/**
 * GenesisVision
 * Created by Vitaly on 2/22/18.
 */

public class FundRequest implements Parcelable
{
	public static final Creator<FundRequest> CREATOR = new Creator<FundRequest>()
	{
		@Override
		public FundRequest createFromParcel(Parcel in) {
			return new FundRequest(in);
		}

		@Override
		public FundRequest[] newArray(int size) {
			return new FundRequest[size];
		}
	};

	@SerializedName("fund_id")
	private UUID fundId;

	@SerializedName("fund_name")
	private String fundName;

	@SerializedName("manager_name")
	private String managerName;

	@SerializedName("fund_logo")
	private String fundLogo;

	@SerializedName("fund_color")
	private String fundColor;

	@SerializedName("amount_top_text")
	private String amountTopText;

	@SerializedName("entry_fee_text")
	private String infoMiddleText;

	@SerializedName("amount_due_text")
	private String amountBottomText;

	@SerializedName("amount")
	private Double amount = 0.0;

	public FundRequest() {

	}

	protected FundRequest(Parcel in) {
		fundId = (UUID) in.readValue(UUID.class.getClassLoader());
		fundName = in.readString();
		managerName = in.readString();
		fundLogo = in.readString();
		fundColor = in.readString();
		amountTopText = in.readString();
		infoMiddleText = in.readString();
		amountBottomText = in.readString();
		amount = in.readDouble();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeValue(fundId);
		dest.writeString(fundName);
		dest.writeString(managerName);
		dest.writeString(fundLogo);
		dest.writeString(fundColor);
		dest.writeString(amountTopText);
		dest.writeString(infoMiddleText);
		dest.writeString(amountBottomText);
		dest.writeDouble(amount);
	}

	public UUID getFundId() {
		return fundId;
	}

	public void setFundId(UUID fundId) {
		this.fundId = fundId;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getFundLogo() {
		return fundLogo;
	}

	public void setFundLogo(String fundLogo) {
		this.fundLogo = fundLogo;
	}

	public String getFundColor() {
		return fundColor;
	}

	public void setFundColor(String fundColor) {
		this.fundColor = fundColor;
	}

	public String getAmountTopText() {
		return amountTopText;
	}

	public void setAmountTopText(String amountTopText) {
		this.amountTopText = amountTopText;
	}

	public String getInfoMiddleText() {
		return infoMiddleText;
	}

	public void setInfoMiddleText(String infoMiddleText) {
		this.infoMiddleText = infoMiddleText;
	}

	public String getAmountBottomText() {
		return amountBottomText;
	}

	public void setAmountBottomText(String amountBottomText) {
		this.amountBottomText = amountBottomText;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
