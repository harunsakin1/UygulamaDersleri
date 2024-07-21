package week03.day05;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
	public static void main(String[] args) {
		String[] tkm = {"tas", "kagit", "makas"};
		oyun(tkm);
	}
	public static void oyun(String[] tkm) {
		Scanner sc = new Scanner(System.in);
		int kullaniciSkor = 0, pcSkor = 0,round=0;
		String kontrol = "";
		do {
			String kullaniciSecim = kullaniciSecim();
			String pcSecim = pcSecim(tkm);
			if (pcSecim.equalsIgnoreCase(kullaniciSecim)) {
				System.out.println("BERABERE");
				System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
			}
			else {
				switch (kullaniciSecim) {
					case "tas": {
						if (pcSecim.equalsIgnoreCase("Kagit")) {
							System.out.println("BILGISAYAR KAZANDI");
							pcSkor++;
							System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
						}
						else {
							System.out.println("KULLANICI KAZANDI");
							kullaniciSkor++;
							System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
						}
						break;
					}
					case "kagit": {
						if (pcSecim.equalsIgnoreCase("Tas")) {
							System.out.println("KULLANICI KAZANDI");
							kullaniciSkor++;
							System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
						}
						else {
							System.out.println("BILGISAYAR KAZANDI");
							pcSkor++;
							System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
						}
						break;
					}
					case "makas": {
						if (pcSecim.equalsIgnoreCase("Tas")) {
							System.out.println("BILGISAYAR KAZANDI");
							pcSkor++;
							System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
						}
						else {
							System.out.println("KULLANICI KAZANDI");
							kullaniciSkor++;
							System.out.println("Kullanýcý Skoru : " + kullaniciSkor + " Bilgisayar Skoru :" + pcSkor);
						}
						break;
					}
					default: {
						System.out.println("Lütfen geçerli bir seçim yapýnýz!");
						break;
					}
				}
			}
			round++;
//				if (pcSkor==3||kullaniciSkor==3){
//					System.out.println("OYUN BÝTTÝ!");
//				System.out.println("OYUN "+round+" ROUND SÜRDÜ");
//				if (kullaniciSkor > pcSkor) {
//					System.out.println("TEBRÝKLER, KAZANDINIZ!");
//				}
//				else if (pcSkor > kullaniciSkor) {
//					System.out.println("BÝLGÝSAYAR KAZANDI!");
//				}
//				else {
//					System.out.println("BERABERE");
//				}
//				System.exit(1);
//			}
			System.out.println("Oyuna devam etmek ister misiniz (E/H)");
			kontrol = sc.nextLine();
			
			
		} while (kontrol.equalsIgnoreCase("E"));
		System.out.println("OYUN BÝTTÝ!");
		System.out.println("OYUN "+round+" ROUND SÜRDÜ");
		if (kullaniciSkor > pcSkor) {
			System.out.println("TEBRÝKLER, KAZANDINIZ!");
		}
		else if (pcSkor > kullaniciSkor) {
			System.out.println("BÝLGÝSAYAR KAZANDI!");
		}
		else {
			System.out.println("BERABERE");
		}
		
	}
	public static String kullaniciSecim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Taþ-Kaðýt-Makas üçlüsünden birini seçiniz.");
		String kullaniciSecim = sc.nextLine();
		return kullaniciSecim;
	}
	public static String pcSecim(String[] tkm) {
		Random rnd = new Random();
		String pcSecim = tkm[rnd.nextInt(tkm.length)];
		return pcSecim;
	}
}