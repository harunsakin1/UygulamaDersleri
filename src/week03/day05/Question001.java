package week03.day05;

import java.util.Random;
import java.util.Scanner;

public class Question001 {
	
	public static void main(String[] args) {
		menu();
	}
	
	static void menu() {
		Scanner scanner = new Scanner(System.in);
		String tekrar;
		int oyuncuSkor = 0;
		int bilgisayarSkor = 0;
		
		do {
			System.out.println("##### TAÞ KAÐIT MAKAS OYUNU #####");
			System.out.println("LÜTFEN BÝRÝNÝ SEÇÝNÝZ ----> TAÞ, KAÐIT, MAKAS");
			String secim = scanner.nextLine();
			String bilgisayarSecim = randomSayi();
			
			System.out.println("Bilgisayarýn Seçimi: " + bilgisayarSecim);
			String sonuc = oyun(secim, bilgisayarSecim);
			
			System.out.println(sonuc);
			if (sonuc.equals("KULLANICI KAZANDI")) {
				oyuncuSkor++;
			}
			else if (sonuc.equals("BÝLGÝSAYAR KAZANDI")) {
				bilgisayarSkor++;
			}
			
			System.out.print("Tekrar oynamak ister misiniz ? (E/H): ");
			tekrar = scanner.nextLine().toUpperCase();
			
		} while (tekrar.equalsIgnoreCase("E"));
		
		System.out.println("SON! \nBilgisayar: " + bilgisayarSkor + " - Oyuncu: " + oyuncuSkor);
	}
	
	public static String randomSayi() {
		Random rnd = new Random();
		int rastgele = rnd.nextInt(3);
		switch (rastgele) {
			case 0:
				return "TAÞ";
			case 1:
				return "KAÐIT";
			case 2:
				return "MAKAS";
			default:
				return "";
		}
	}
	
	public static String oyun(String kullaniciSecimi, String tkm) {
		if (kullaniciSecimi.equalsIgnoreCase("TAÞ")) {
			if (tkm.equalsIgnoreCase("TAÞ")) {
				return "BERABERE";
			}
			else if (tkm.equalsIgnoreCase("KAÐIT")) {
				return "BÝLGÝSAYAR KAZANDI";
			}
			else {
				return "KULLANICI KAZANDI";
			}
		}
		else if (kullaniciSecimi.equalsIgnoreCase("KAÐIT")) {
			if (tkm.equalsIgnoreCase("TAÞ")) {
				return "KULLANICI KAZANDI";
			}
			else if (tkm.equalsIgnoreCase("KAÐIT")) {
				return "BERABERE";
			}
			else {
				return "BÝLGÝSAYAR KAZANDI";
			}
		}
		else if (kullaniciSecimi.equalsIgnoreCase("MAKAS")) {
			if (tkm.equalsIgnoreCase("TAÞ")) {
				return "BÝLGÝSAYAR KAZANDI";
			}
			else if (tkm.equalsIgnoreCase("KAÐIT")) {
				return "KULLANICI KAZANDI";
			}
			else {
				return "BERABERE";
			}
		}
		return "Geçersiz Seçim";
	}
}