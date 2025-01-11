package fis.api.model.response;

public class Usd {
	private String code;
	private String symbol;
	private String rate;
	private String description;
	private String rate_float;
	
	public Usd() {
		super();
	}

	public Usd(String code, String symbol, String rate, String description, String rate_float) {
		super();
		this.code = code;
		this.symbol = symbol;
		this.rate = rate;
		this.description = description;
		this.rate_float = rate_float;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRate_float() {
		return rate_float;
	}

	public void setRate_float(String rate_float) {
		this.rate_float = rate_float;
	}

	@Override
	public String toString() {
		return "EUR [code=" + code + ", symbol=" + symbol + ", rate=" + rate + ", description=" + description
				+ ", rate_float=" + rate_float + "]";
	}
	
}
