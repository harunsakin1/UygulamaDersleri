package week03.day02;

import java.util.Scanner;

public class Question001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir ulke giriniz : ");
		String girilenUlke = sc.nextLine();
		String[] ulkeler = {"Turkiye", "Japonya", "Mogolistan", "Amerika", "Rusya", "Cin"};
		boolean flag = false;
		for (int i = 0; i < ulkeler.length; i++) {
			if (ulkeler[i].equalsIgnoreCase(girilenUlke)) {
				flag = true;
				if (flag) {
					System.out.println(girilenUlke + " dizi icerisinde var ve " + i + " . indexte bulunuyor.");
				}
			}
		}
		if (!flag) {
			System.out.println(girilenUlke + " dizi icerisinde bulunmamaktadir");
		}
		
	}
}