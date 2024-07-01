package week02.day01;

import java.util.Scanner;

public class Question006 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1,s2;
		float ort;
		System.out.print("1.Sayiyi Giriniz : ");
		s1=sc.nextInt();
		System.out.print("2.Sayiyi Giriniz : ");
		s2=sc.nextInt();
		boolean ciftMi=(s1+s2)%2==0;//?true:false;
		System.out.println(ciftMi);
		ort=(float) (s1+s2)/2;
		System.out.println("Ortalama : "+ort);
		sc.close();
	}
}