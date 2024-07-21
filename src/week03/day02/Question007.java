package week03.day02;

/*
7- Dizide 13 say?s?na denk gelene kadar devam edelim.
13 say?s? bulunduktan sonra ondan bir sonraki gelen say? 13 de?il ise 13'den sonra gelen say?y? toplama ekleyelim.
-> 1, 13, 13, 13, 5, 13
 */
public class Question007 {
	public static void main(String[] args) {
		int toplam = 0;
		int[] sayilar = {1, 13, 13, 13, 5, 13,6};
		for (int i = 0; i < sayilar.length - 1; i++) {
			if (sayilar[i] == 13) {
				if (sayilar[i + 1] != 13) {
					toplam += sayilar[i + 1];
				}
			}
		}
		System.out.println(toplam);
	}
}