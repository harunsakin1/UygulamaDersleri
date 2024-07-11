package week03.day02;

import java.util.Arrays;

/*
8- String'i parçalara ay?ral?m, bir array'e kaydedelim. Sonra a?a??daki örnek ç?kt?y? almaya çal??al?m;

"Adana ?ehrinin plaka kodu : 01"

Asa?daki ?ehirler tek bir String degerdir.
-> 01-Adana;02-Ad?yaman;03-Afyonkarahisar;04-A?r?;05-Amasya;06-Ankara;07-Antalya;
08-Artvin;09-Ayd?n;10-Bal?kesir;42-Konya
 */
public class Deneme {
	public static void main(String[] args) {
		/*String metin="01-Adana;02-Adiyaman;03-Afyonkarahisar;04-Agri;05-Amasya;06-Ankara;07-Antalya;08-Artvin;" +
				"09-Aydin;10-Balikesir;42-Konya";
		String[]sehirler= metin.split(";");
		String sehirAdi="";
		String plakaKodu="";
		int index;
		for (String sehir:sehirler) {
			index=sehir.indexOf("-");
			sehirAdi=sehir.substring(index+1);
			plakaKodu=sehir.substring(0,index);
			System.out.println(sehirAdi+" sehrinin plaka kodu : "+plakaKodu);
		}*/
		
		int[][]carpimTablosu=new int[10][10];
		for (int i = 0; i < carpimTablosu.length ; i++) {
			for (int j = 0; j < carpimTablosu[i].length ; j++) {
				carpimTablosu[i][j]=(i+1)*(j+1);
			}
		}
		for (int i = 0; i < carpimTablosu.length ; i++) {
			for (int j = 0; j < carpimTablosu[i].length ; j++) {
				System.out.print((i+1)+" x "+(j+1)+" = "+carpimTablosu[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}