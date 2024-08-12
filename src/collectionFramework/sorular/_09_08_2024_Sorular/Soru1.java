package collectionFramework.sorular._09_08_2024_Sorular;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
1- Ýçerisinde String isimler tutacak bir queue tanýmlayalim. adi biletKuyrugu olsun.
kuyruga 10 kisi ekleyelim ve biletSatis isimli bir metotta 1-15 arasý random sayida kisiye biletleri dagitalim.

Biletini alanlar için; ".. biletini aldý" çýktýsý verelim.
Bilet bittiginde : "Bilet kalmadi..." ciktisi verelim.

Biletini alamayanlari yazdiralim. "... bilet alamadi..."
 */
public class Soru1 {
	static Random rnd = new Random();
	
	static Queue<String> biletSirasi = new LinkedList<>();
	
	public static void main(String[] args) {
		sirayaKisiEkle();
		biletSatis();
	}
	
	private static void biletSatis() {
		int biletSayisi = rnd.nextInt(7, 13);
		System.out.println(biletSayisi);
		int satilanBiletSayisi = 0;
		do {
			
			System.out.println(biletSirasi.poll() + " biletini aldi");
			satilanBiletSayisi++;
			biletSayisi--;
			
			if (biletSayisi > 0 && biletSirasi.isEmpty()) {
				System.out.println("Toplam " + satilanBiletSayisi + " adet bilet satildi. Kalan bilet : " + biletSayisi);
				break;
			}
			else if (biletSayisi == 0) {
				System.out.println("Toplam " + satilanBiletSayisi + " adet bilet satildi... Stoklar tukenmistir.");
				break;
			}
			
		} while (!biletSirasi.isEmpty());
	}
	
	private static void sirayaKisiEkle() {
		biletSirasi.add("Alex");
		biletSirasi.add("Alperen");
		biletSirasi.add("Harun");
		biletSirasi.add("Emirhan");
		biletSirasi.add("Mehmet");
		biletSirasi.add("Ahmet");
		biletSirasi.add("Selin");
		biletSirasi.add("Evrim");
		biletSirasi.add("Burak");
		biletSirasi.add("Baris");
	}
}