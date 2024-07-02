package week02.day01;

import java.util.Scanner;

public class Question008 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi,toplam=0;
		System.out.print("Bir sayi giriniz : ");
		sayi=sc.nextInt();
		for (int i=1;i<=sayi;i++){
		//	toplam=toplam+(i+1);
			toplam+=(i+1);
		}
		System.out.println(toplam);
		sc.close();
	}
}