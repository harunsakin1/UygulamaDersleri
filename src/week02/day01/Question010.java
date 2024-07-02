package week02.day01;

import java.util.Scanner;

public class Question010 {
	public static void main(String[] args) {
		int sayi, basamakToplam = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		sayi = sc.nextInt();
		while (sayi > 0) {
			basamakToplam += (sayi % 10);
			sayi /= 10;
		}
		System.out.println("Basamak toplami = " + basamakToplam);
		sc.close();
		
	}
}