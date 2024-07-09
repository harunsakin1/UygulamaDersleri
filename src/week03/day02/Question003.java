package week03.day02;


/*
3- Dizideki en buyuk 2. sayiyi bulalim.
-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
 */
public class Question003 {
	public static void main(String[] args) {
		int[] sayilar = {1300, 120, 130, 125, -256, 16, 1258, 81, 14};
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > max) {
				max = sayilar[i];
			}
		}
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < max && sayilar[i] > max2) {
				max2 = sayilar[i];
			}
		}
		System.out.println("En buyuk 2. sayi : " + max2);
		
	}
}