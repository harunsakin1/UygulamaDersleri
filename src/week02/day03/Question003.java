package week02.day03;

import java.util.Scanner;

public class Question003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz :");
		int sayi = sc.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayi/2; i++) {
			if (sayi % i == 0) {
				System.out.println(sayi + " sayisinin bolenleri : " + i);
				toplam += i;
			}
		}
		System.out.println("Bolenleri toplami : " + toplam);
		if (toplam == sayi) {
			System.out.println(sayi + " sayisi mukemmel bir sayidir");
		}
		else {
			System.out.println(sayi + " sayisi mukemmel bir sayi degildir");
		}
	}
}