package week02.day02;

import java.util.Scanner;

public class Question001    {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int taban, ust,sonuc=1;
		System.out.print("Bir taban sayisi giriniz : ");
		taban=sc.nextInt();
		System.out.print("Bir ust sayisi giriniz : ");
		ust=sc.nextInt();
		sc.nextLine();
		for (int i=0;i<ust;i++){
			sonuc*=taban;
		}
//		sonuc=Math.pow(taban,ust);
		System.out.print("Isminizi Giriniz : ");
		
		String isim=sc.nextLine();
		
		System.out.println("Kullanici ismi : "+isim+"\t\t"+taban+" uzeri "+ust+" = "+sonuc);
		sc.close();
		
		
		
	}
}