package week02.day03;

import java.util.Scanner;

public class Question002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ay giriniz : ");
		int ay = sc.nextInt();
		System.out.println("Gun giriniz : ");
		int gun = sc.nextInt();
		
		switch (ay) {
			case 1:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 21 && gun > 0) {
					System.out.println("Oglak");
				}
				else if (gun > 21 && gun <= 31) {
					System.out.println("Kova");
				}
				break;
			case 2:
				if (gun >= 30 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 19 && gun > 0) {
					System.out.println("Kova");
				}
				else if (gun > 19 && gun <= 29) {
					System.out.println("Balik");
				}
				break;
			case 3:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 20 && gun > 0) {
					System.out.println("Balik");
				}
				else if (gun > 20 && gun <= 31) {
					System.out.println("Koc");
				}
				break;
			case 4:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 20 && gun > 0) {
					System.out.println("Koc ");
				}
				else if (gun > 20 && gun <= 31) {
					System.out.println("Boga");
				}
				break;
			case 5:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 21 && gun > 0) {
					System.out.println("Boga ");
				}
				else if (gun > 21 && gun <= 31) {
					System.out.println("Ikizler");
				}
				break;
			case 6:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 22 && gun > 0) {
					System.out.println("Ikizler ");
				}
				else if (gun > 22 && gun <= 31) {
					System.out.println("Yengec");
				}
				break;
			case 7:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 22 && gun > 0) {
					System.out.println("Yengec");
				}
				else if (gun > 22 && gun <= 31) {
					System.out.println("Aslan");
				}
				break;
			case 8:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 22 && gun > 0) {
					System.out.println("Aslan");
				}
				else if (gun > 22 && gun <= 31) {
					System.out.println("Basak");
				}
				break;
			case 9:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 22 && gun > 0) {
					System.out.println("Basak");
				}
				else if (gun > 22 && gun <= 31) {
					System.out.println("Terazi");
				}
				break;
			case 10:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 22 && gun > 0) {
					System.out.println("Terazi");
				}
				else if (gun > 22 && gun <= 31) {
					System.out.println("Akrep");
				}
				break;
			case 11:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 21 && gun > 0) {
					System.out.println("Akrep");
				}
				else if (gun > 21 && gun <= 31) {
					System.out.println("Yay");
				}
				break;
			case 12:
				if (gun >= 31 || gun < 0) {
					System.out.println("Hatali giris yaptiniz.");
				}
				else if (gun <= 21 && gun > 0) {
					System.out.println("Yay");
				}
				else if (gun > 21 && gun <= 31) {
					System.out.println("Oglak");
				}
				break;
			default:
				System.out.println("Lutfen 1-12 arasinda sayi giriniz.");
				break;
		}
		
	}
}