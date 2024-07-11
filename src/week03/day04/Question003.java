package week03.day04;

import java.util.Scanner;
/*
3- Kullanici disaridan bir sayi girecek.

Ornek girdi = 10;
Sirasiyla;
1- 10 + 50
2- (10+50) * 30
3- ((10+50)*30) -40
4- (((10+50)*30) -40) / 20
islemlerini yaptiracagiz.

Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim.
 */
public class Question003 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz : ");
		int sayi=sc.nextInt();
		System.out.println(sayidanBirBucukCikar(sayi));
	}
	public static int sayiyaElliEkle(int sayi){
		return sayi+50;
	}
	public static int sayiyiOtuzlaCarp(int sayi){
		return sayiyaElliEkle(sayi)*30;
	}
	public static int sayidanKirkCikar(int sayi){
		return sayiyiOtuzlaCarp(sayi)-40;
	}
	public static double sayiyiYirmiyeBol(int sayi){
		return sayidanKirkCikar(sayi)/20.0;
	}
	public static double sayidanBirBucukCikar(int sayi){
		return sayiyiYirmiyeBol(sayi);
	}
}