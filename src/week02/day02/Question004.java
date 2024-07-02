package week02.day02;

import java.util.Scanner;

public class Question004 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int carpim=1;
		System.out.print("Carpim tablosunu gormek istediginiz sayiyi giriniz : ");
		int sayi=sc.nextInt();
		for ( int i=1;i<=10;i++){
			carpim=i*sayi;
			System.out.println(i +"\tx\t"+sayi+ "\t=\t"+carpim);
		}
		sc.close();
		
	}
}