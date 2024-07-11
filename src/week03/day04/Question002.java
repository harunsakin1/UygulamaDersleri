package week03.day04;

import java.util.Scanner;

/*
2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).

2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
 */
public class Question002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Girilecek sayi adedini giriniz (2 - 3)");
		int secim=sc.nextInt();
		switch (secim){
			case 2:{
				System.out.println("Toplam = "+sayiTopla());
				break;
			}
			case 3:{
				System.out.println("1.Sayiyi giriniz : ");
				int sayi1=sc.nextInt();
				System.out.println("2.Sayiyi giriniz : ");
				int sayi2=sc.nextInt();
				System.out.println("3.Sayiyi giriniz : ");
				int sayi3=sc.nextInt();
				System.out.println("Toplam = "+sayiTopla(sayi1,sayi2,sayi3));
				break;
			}
			default:{
				System.out.println("Lutfen gecerli bir sayi giriniz.");
			}
		}
	}
	public static int sayiTopla(){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Sayiyi giriniz  : ");
		int sayi1=sc.nextInt();
		System.out.println("2.Sayiyi giriniz  : ");
		int sayi2=sc.nextInt();
		return sayi1+sayi2;
	}
	public static int sayiTopla(int sayi1,int sayi2,int sayi3){
		return sayi1+sayi2+sayi3;
	}
}