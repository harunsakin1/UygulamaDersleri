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
			System.out.println("##### TA� KA�IT MAKAS OYUNU #####");
			System.out.println("L�TFEN B�R�N� SE��N�Z ----> TA�, KA�IT, MAKAS");
			String secim = scanner.nextLine();
			String bilgisayarSecim = randomSayi();
			
			System.out.println("Bilgisayar�n Se�imi: " + bilgisayarSecim);
			String sonuc = oyun(secim, bilgisayarSecim);
			
			System.out.println(sonuc);
			if (sonuc.equals("KULLANICI KAZANDI")) {
				oyuncuSkor++;
			}
			else if (sonuc.equals("B�LG�SAYAR KAZANDI")) {
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
				return "TA�";
			case 1:
				return "KA�IT";
			case 2:
				return "MAKAS";
			default:
				return "";
		}
	}
	
	public static String oyun(String kullaniciSecimi, String tkm) {
		if (kullaniciSecimi.equalsIgnoreCase("TA�")) {
			if (tkm.equalsIgnoreCase("TA�")) {
				return "BERABERE";
			}
			else if (tkm.equalsIgnoreCase("KA�IT")) {
				return "B�LG�SAYAR KAZANDI";
			}
			else {
				return "KULLANICI KAZANDI";
			}
		}
		else if (kullaniciSecimi.equalsIgnoreCase("KA�IT")) {
			if (tkm.equalsIgnoreCase("TA�")) {
				return "KULLANICI KAZANDI";
			}
			else if (tkm.equalsIgnoreCase("KA�IT")) {
				return "BERABERE";
			}
			else {
				return "B�LG�SAYAR KAZANDI";
			}
		}
		else if (kullaniciSecimi.equalsIgnoreCase("MAKAS")) {
			if (tkm.equalsIgnoreCase("TA�")) {
				return "B�LG�SAYAR KAZANDI";
			}
			else if (tkm.equalsIgnoreCase("KA�IT")) {
				return "KULLANICI KAZANDI";
			}
			else {
				return "BERABERE";
			}
		}
		return "Ge�ersiz Se�im";
	}
}