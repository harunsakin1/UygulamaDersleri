package week02.day03.odev;

import java.util.Scanner;

public class KullaniciMenusu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir dil seciniz / Please choose a language");
		System.out.println("{Turkce ----> 1}\t\t{English ----> 2}");
		int dilSecimi = sc.nextInt();
		int menuSecim;
		if (dilSecimi == 1) {
			System.out.println("0 -- Cikis Yap\n1 -- Merhaba Dunya yazdir\n2 -- " + "Factorial calculation\n3 -- " +
					                   "Prime number check");
			menuSecim = -1;
			while (menuSecim != 0) {
				System.out.println("Lutfen bir secim yapiniz.");
				menuSecim = sc.nextInt();
				if (menuSecim == 1) {
					System.out.println("Merhaba Dunya");
				}
				else if (menuSecim == 2) {
					int sayi, carpim = 1;
					System.out.print("Bir sayi giriniz : ");
					sayi = sc.nextInt();
					for (int i = 2; i <= sayi; i++) {
						carpim = carpim * i;
					}
					
					System.out.println(carpim);
				}
				else if (menuSecim == 3) {
					long sayi, i;
					boolean asalMi = true;
					System.out.println("Bir sayi giriniz : ");
					sayi = sc.nextLong();
					if (sayi <= 1 || sayi % 2 == 0 && sayi != 2) {
						System.out.println(sayi + " sayisi asal sayi degildir.");
					}
					else if (sayi == 2) {
						System.out.println(sayi + " sayisi asal sayidir.");
					}
					else {
						for (i = 3; i <= Math.sqrt(sayi); i += 2) {
							if (sayi % i == 0) {
								asalMi = false;
								break;
							}
						}
						if (asalMi) {
							System.out.println(sayi + " sayisi asal sayidir.");
						}
						else {
							System.out.println(sayi + " sayisi asal sayi degildir.");
						}
					}
				}
				else if (menuSecim != 0) {
					System.out.println("Lutfen 0 ile 3 arasinda bir sayi giriniz!");
					break;
				}
			}
		}
		else if (dilSecimi == 2) {
			System.out.println("0 -- Log Out\n1 -- Print Hello World\n2 -- Factorial calculation\n3 -- Prime number " + "check");
			menuSecim = -1;
			while (menuSecim != 0) {
				System.out.println("Please make a choose.");
				menuSecim = sc.nextInt();
				if (menuSecim == 1) {
					System.out.println("Hello World");
				}
				else if (menuSecim == 2) {
					int sayi, carpim = 1;
					System.out.print("Enter a number : ");
					sayi = sc.nextInt();
					for (int i = 2; i <= sayi; i++) {
						carpim = carpim * i;
					}
					
					System.out.println(carpim);
				}
				else if (menuSecim == 3) {
					long sayi, i;
					boolean asalMi = true;
					System.out.println("Enter a number : ");
					sayi = sc.nextLong();
					if (sayi <= 1 || sayi % 2 == 0 && sayi != 2) {
						System.out.println(sayi + " is not a prime number.");
					}
					else if (sayi == 2) {
						System.out.println(sayi + " is a prime number.");
					}
					else {
						for (i = 3; i <= Math.sqrt(sayi); i += 2) {
							if (sayi % i == 0) {
								asalMi = false;
								break;
							}
						}
						if (asalMi) {
							System.out.println(sayi + " is a prime number.");
						}
						else {
							System.out.println(sayi + " is not a prime number.");
						}
					}
				}
				else if (menuSecim != 0) {
					System.out.println("Please enter a number between 0 and 3!");
					break;
				}
			}
		}
		else {
			System.out.println("Dil secimi icin 1 veya 2 sayisini girmeniz gerekiyor.\t\tYou need to enter the number" + " 1 or 2 to select the language.");
		}
		
	}
}