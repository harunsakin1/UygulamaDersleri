package week02.day01;

import java.util.Scanner;

public class Question007 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi,carpim=1;
		System.out.print("Bir sayi giriniz : ");
		sayi=sc.nextInt();
		for (int i=2;i<=sayi;i++){
			carpim=carpim*i;
		}
		
		System.out.println(carpim);
		sc.close();
		
	}
}