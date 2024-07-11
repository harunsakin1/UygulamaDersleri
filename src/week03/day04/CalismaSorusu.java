package week03.day04;

import java.util.Arrays;
import java.util.Scanner;

public class CalismaSorusu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizi uzunlugu giriniz : ");
		int diziUzunluk = sc.nextInt();
		int[] sayilar = new int[diziUzunluk];
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i + 1) + ". elemani giriniz : ");
			sayilar[i] = sc.nextInt();
		}
		System.out.println("Dizideki sayilarin ortalamasi : " + ortalamaAl(sayilar));
		System.out.println("Dizideki sayilarin standart sapmasi : " + standartSapmaHesapla(sayilar));
		System.out.println("Dizideki sayilarin medyani : " + medyanBul(sayilar));
		
		
	}
	
	public static double ortalamaAl(int[] sayilar) {
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		double ortalama = (double) toplam / (sayilar.length);
		return ortalama;
	}
	
	/*
	Standart sapma hesaplama :
	 1) Verilerin aritmetik ortalaması bulunur.
	 2) Her bir veri ile aritmetik ortalama arasındaki fark bulunur.
	 3) Bulunan farkların her birinin karesi alınır ve elde edilen sayılar toplanır.
	 4) Bu toplam, veri sayısının 1 eksiğine bölünür ve bölümün karekökü bulunur.
	 */
	public static double standartSapmaHesapla(int[] sayilar) {
		double fark = 0, toplam = 0, standartSapma;
		double ort = ortalamaAl(sayilar);
		for (int i = 0; i < sayilar.length; i++) {
			fark = (sayilar[i] - ort) * (sayilar[i] - ort);
			toplam += fark;
		}
		standartSapma = Math.sqrt(toplam / (sayilar.length - 1));
		return standartSapma;
	}
	
	/*
	Medyan Bulma : Diziyi küçükten büyüğe doğru sıralıyoruz. Eğer dizi uzunluğu tek ise medyan ortadaki sayıdır. Eğer
	 dizi uzunluğu çiftse medyan ortadaki 2 sayının ortalamasıdır.
	 */
	public static double medyanBul(int[] sayilar) {
		Arrays.sort(sayilar);
		if (sayilar.length % 2 == 1) {
			return sayilar[sayilar.length / 2];
		}
		else {
			//return (((sayilar.length / 2) + 1) + ((sayilar.length) / 2)) / 2.0;
			int ortadakiEleman=(sayilar.length/2)-1;
			int ortadakiEleman2=sayilar.length/2;
			return ((sayilar[ortadakiEleman])+(sayilar[ortadakiEleman2]))/2.0;
		}
		
	}
}