package fis.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bpi {
	@JsonProperty("USD")
	private Usd USD;
	@JsonProperty("GBP") 
	private Gbp GBP;
	@JsonProperty("EUR") 
	private Eur EUR;
	
	public Bpi() {
		super();
	}

	public Bpi(Usd usd, Gbp gbp, Eur eur) {
		super();
		USD = usd;
		GBP = gbp;
		EUR = eur;
	}

	public Usd getUSD() {
		return USD;
	}

	public void setUSD(Usd usd) {
		USD = usd;
	}

	public Gbp getGBP() {
		return GBP;
	}

	public void setGBP(Gbp gbp) {
		GBP = gbp;
	}

	public Eur getEUR() {
		return EUR;
	}

	public void setEUR(Eur eur) {
		EUR = eur;
	}

	@Override
	public String toString() {
		return "Bpi [USD=" + USD + ", GBP=" + GBP + ", EUR=" + EUR + "]";
	}
	
}
