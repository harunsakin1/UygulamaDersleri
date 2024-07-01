package week02.day01;

import java.util.Scanner;

public class Question004 {
	public static void main(String[] args) {
		int yas;
		String isim;
		Scanner sc=new Scanner(System.in);
		System.out.println("Yasinizi Giriniz : ");
		yas=sc.nextInt();
		sc.nextLine();
		System.out.println("Isminizi Giriniz : ");
		isim=sc.nextLine();
		System.out.println("Isim : "+isim+"\n"+"Yas : "+yas);
		sc.close();
	}
}