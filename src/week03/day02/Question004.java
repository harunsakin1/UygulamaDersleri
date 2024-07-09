package week03.day02;

/*
4- Bir dizide ard arda gelen 2 indexdeki say? de?eri 2 ise true yazd?r?p döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2
 */
public class Question004 {
	public static void main(String[] args) {
		int[] sayilar = {2, -256, 2, 1258, 2, 2};
		boolean flag = false;
		for (int i = 0; i < sayilar.length - 1; i++) {
			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}
}