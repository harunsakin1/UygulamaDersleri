package week02.day01;

import java.util.Scanner;

public class Question010 {
	public static void main(String[] args) {
		int sayi, basamakToplam = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		sayi = sc.nextInt();
		while (sayi > 0) {
			basamakToplam= basamakToplam + (sayi%10);
			sayi = sayi / 10;
		}
		System.out.println("Basamak toplami = " + basamakToplam);
		sc.close();
		
	}
}