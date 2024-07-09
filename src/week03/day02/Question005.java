package week03.day02;

/*
5 -
Dizideki bütün say?lar?n toplam?n? yazd?ral?m.
Dizinin her bir eleman? için;
çift ise çifttir, tek ise tektir yazd?ral?m.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */
public class Question005 {
	public static void main(String[] args) {
		int[] sayilar = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayisi cifttir");
			}
			else {
				System.out.println(sayilar[i] + " sayisi tektir");
			}
		}
		System.out.println("Sayilarin toplami : " + toplam);
	}
}