package week02.day03;

import java.util.Scanner;

public class Question001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-7 Arasi sayi giriniz : ");
		int sayi = sc.nextInt();
		String gun = switch (sayi) {
			case 1 -> "Pazartesi";
			case 2 -> "Sali";
			case 3 -> "Carsamba";
			case 4 -> "Persembe";
			case 5 -> "Cuma";
			case 6 -> "Cumartesi";
			case 7 -> "Pazar";
			default -> throw new IllegalStateException("Lutfen gecerli bir sayi giriniz.");
		};
		System.out.println("Sectiginiz gun : " + gun);
	}
}