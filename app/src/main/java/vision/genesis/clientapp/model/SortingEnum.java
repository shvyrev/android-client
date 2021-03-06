package vision.genesis.clientapp.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 02/08/2018.
 */
@JsonAdapter(SortingEnum.Adapter.class)
public enum SortingEnum
{
	BYLEVELASC("ByLevelAsc"),

	BYLEVELDESC("ByLevelDesc"),

	BYPROFITASC("ByProfitAsc"),

	BYPROFITDESC("ByProfitDesc"),

	BYDRAWDOWNASC("ByDrawdownAsc"),

	BYDRAWDOWNDESC("ByDrawdownDesc"),

	BYTRADESASC("ByTradesAsc"),

	BYTRADESDESC("ByTradesDesc"),

	BYTINVESTORSASC("ByInvestorsAsc"),

	BYTINVESTORSDESC("ByInvestorsDesc"),

	BYENDOFPERIODASC("ByEndOfPeriodAsc"),

	BYENDOFPERIODDESC("ByEndOfPeriodDesc"),

	BYTITLEASC("ByTitleAsc"),

	BYTITLEDESC("ByTitleDesc"),

	BYBALANCEASC("ByBalanceAsc"),

	BYBALANCEDESC("ByBalanceDesc");

	public static SortingEnum fromValue(String text) {
		for (SortingEnum b : SortingEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	private String value;

	SortingEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static class Adapter extends TypeAdapter<SortingEnum>
	{
		@Override
		public void write(final JsonWriter jsonWriter, final SortingEnum enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public SortingEnum read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return SortingEnum.fromValue(String.valueOf(value));
		}
	}
}
