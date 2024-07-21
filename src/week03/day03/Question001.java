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
					int toplam=topla(ikiSayiAl());
					System.out.println(toplam);
					break;
				}
				case 2: {
					int cikar=cikar(ikiSayiAl());
					System.out.println(cikar);
					break;
				}
				case 3: {;
					int carpim=carp(ikiSayiAl());
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
	public static int topla(int[]sayilar){
		int toplam=sayilar[0]+sayilar[1];
		return toplam;
	}
	public static int cikar(int[]sayilar){
		int toplam=sayilar[0]-sayilar[1];
		return toplam;
	}
	public static int carp(int[]sayilar){
		int toplam=sayilar[0]*sayilar[1];
		return toplam;
	}
	public static double bol(double sayi1,double sayi2){
		return sayi1/sayi2;
	}
	public static int[] ikiSayiAl(){
		int[] sayilar=new int[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz :");
		sayilar[0]=sc.nextInt();
		System.out.println("Birinci sayiyi giriniz :");
		sayilar[1]=sc.nextInt();
		return sayilar;
	}
	
}