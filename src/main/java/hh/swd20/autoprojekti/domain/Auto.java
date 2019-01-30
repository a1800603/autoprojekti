package hh.swd20.autoprojekti.domain;

public class Auto {
	
	
	private String merkki;
	private int valmistusvuosi;
	
	//parametriton konstruktori
	public Auto() {
		super();
		this.merkki = null;
		this.valmistusvuosi = 0;
	}
	//parametrillinen konstruktori
	public Auto(String merkki, int valmistusvuosi) {
		super();
		this.merkki = merkki;
		this.valmistusvuosi = valmistusvuosi;
	}
	
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	public void setValmistusvuosi(int valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;
	}
	public String getMerkki() {
		return merkki;
	}
	public int getValmistusvuosi() {
		return valmistusvuosi;
	}
	@Override
	public String toString() {
		return "Auto [merkki=" + merkki + ", valmistusvuosi=" + valmistusvuosi + "]";
	}
	
	
	
	
	

}
