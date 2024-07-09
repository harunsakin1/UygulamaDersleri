package week03.day02;

/*
8- String'i parçalara ay?ral?m, bir array'e kaydedelim. Sonra a?a??daki örnek ç?kt?y? almaya çal??al?m;

"Adana ?ehrinin plaka kodu : 01"

A?a?daki ?ehirler tek bir String degerdir.
-> 01-Adana;02-Ad?yaman;03-Afyonkarahisar;04-A?r?;05-Amasya;06-Ankara;07-Antalya;
08-Artvin;09-Ayd?n;10-Bal?kesir;42-Konya
 */
public class Question008 {
	public static void main(String[] args) {
		String metin =
				"01-Adana;02-Adiyaman;03-Afyonkarahisar;04-Agri;05-Amasya;06-Ankara;07-Antalya;08-Artvin;" + "09" + "-Aydin;10-Balikesir;42-Konya";
		String[] sehirler = metin.split(";");
		int index;
		String sehirAdi="";
		String plakaKodu="";
		for (String sehir: sehirler) {
			index=sehir.indexOf("-");
			sehirAdi=sehir.substring(index+1);
			plakaKodu=sehir.substring(0,index);
			System.out.println(sehirAdi+" sehrinin plaka kodu : "+plakaKodu);
		}
	}
}