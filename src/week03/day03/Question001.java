package week03.day03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1- ?ki say?yla 4 i?lem yapabilen bir hesap makinesi uygulamas? yapal?m. Uygulama kullan?c? ç?k?? yapmad?g? sürece çal??maya devam edecek. 4 i?lem için metotlardan faydalanal?m.
 */
public class Question001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secim;
		boolean menuGiris = true;
		while (menuGiris) {
			System.out.println("\n--- Hesap Makinesi ---");
			System.out.println("1- Toplama");
			System.out.println("2- Cikarma");
			System.out.println("3- Carpma");
			System.out.println("4- Bolme");
			System.out.println("0- Cikis");
			System.out.print("Bir islem seciniz : ");
			try {
				secim = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nInteger deger giriniz !");
				continue;
			} finally {
				sc.nextLine();
			}
			switch (secim) {
				case 1: {
					System.out.println("Birinci sayiyi giriniz : ");
					int s1= sc.nextInt();
					System.out.println("Ikinci sayiyi giriniz : ");
					int s2= sc.nextInt();
					int toplam=topla(s1,s2);
					System.out.println(toplam);
					break;
				}
				case 2: {
					System.out.println("Birinci sayiyi giriniz : ");
					int s1= sc.nextInt();
					System.out.println("Ikinci sayiyi giriniz : ");
					int s2= sc.nextInt();
					int cikar=cikar(s1,s2);
					System.out.println(cikar);
					break;
				}
				case 3: {
					System.out.println("Birinci sayiyi giriniz : ");
					int s1= sc.nextInt();
					System.out.println("Ikinci sayiyi giriniz : ");
					int s2= sc.nextInt();
					int carpim=carp(s1,s2);
					System.out.println(carpim);
					break;
				
				}
				case 4: {
					System.out.println("Birinci sayiyi giriniz : ");
					double s1= sc.nextInt();
					System.out.println("Ikinci sayiyi giriniz : ");
					double s2= sc.nextInt();
					double bolum=bol(s1,s2);
					System.out.println(bolum);
					break;
				
				}
				case 0: {
					System.out.println("Uygulama sonlandiriliyor!");
					menuGiris = false;
					break;
				}
				default: {
					System.out.println("Gecerli bir menu secenegi giriniz!");
				}
			}
		}
	}
	public static int topla(int sayi1,int sayi2){
		return sayi1+sayi2;
	}
	public static int cikar(int sayi1,int sayi2){
		return sayi1-sayi2;
	}
	public static int carp(int sayi1,int sayi2){
		return sayi1*sayi2;
	}
	public static double bol(double sayi1,double sayi2){
		return sayi1/sayi2;
	}
}