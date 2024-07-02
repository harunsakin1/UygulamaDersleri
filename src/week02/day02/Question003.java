package week02.day02;

import java.util.Scanner;

public class Question003 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi,toplam=0,sayac=0;
		double ort=0;
		System.out.print("Bir sayi giriniz : ");
		sayi= sc.nextInt();
		while (sayi!=0){
			sayac++;
			toplam=toplam+sayi;
			ort=(double) toplam/sayac;
			System.out.print("Bir sayi giriniz : ");
			sayi= sc.nextInt();
		}
		System.out.println("Sayilar toplami : "+toplam+"\t Sayilarin ortalamasi : "+ort);
		sc.close();
		
	}
}