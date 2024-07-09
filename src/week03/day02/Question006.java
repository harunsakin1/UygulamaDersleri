package week03.day02;

/*
6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçti?ini ve 1 say?s?n?n adeti
4 say?s?n?n adetinden büyükse true de?ilse false yazd?ral?m.
-> 1,4,5,6,1,1,4,8
 */
public class Question006 {
	public static void main(String[] args) {
		int[] sayilar = {1, 4, 5, 6, 1, 1, 4, 8,4,4};
		int sayac1 = 0, sayac4 = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 1) {
				sayac1++;
			}
			if (sayilar[i] == 4) {
				sayac4++;
			}
		}
		System.out.println(sayac1 > sayac4 ? true : false);
	}
}