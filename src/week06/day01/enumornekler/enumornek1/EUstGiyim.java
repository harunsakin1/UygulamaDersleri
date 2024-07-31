package week06.day01.enumornekler.enumornek1;

public enum EUstGiyim {
	TSHIRT("KIRMIZI"),
	KAZAK("LACIVERT"),
	TRIKO("BEYAZ");
	
	private String renk;
	
	EUstGiyim(String renk) {
		this.renk = renk;
	}
}