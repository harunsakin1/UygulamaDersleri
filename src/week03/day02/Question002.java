package week03.day02;

/*
2- En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */
public class Question002 {
	public static void main(String[] args) {
		int[] sayilar = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > max) {
				max = sayilar[i];
			}
			if (sayilar[i] < min) {
				min = sayilar[i];
			}
		}
		System.out.println("En buyuk sayi : " + max);
		System.out.println("En kucuk sayi : " + min);
	}
}