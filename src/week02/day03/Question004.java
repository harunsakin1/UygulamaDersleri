package week02.day03;

import java.util.Scanner;

public class Question004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0, max = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("0-100 arasinda bir sayi giriniz : ");
			int sayi = sc.nextInt();
			if (i == 1) {
				min = sayi;
				max = sayi;
			}
			else {
				if (sayi > max) {
					max = sayi;
				}
				if (sayi < min) {
					min = sayi;
				}
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		
	}
}