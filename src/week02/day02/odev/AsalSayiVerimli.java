package week02.day02.odev;

import java.lang.Math;
import java.util.Scanner;

public class AsalSayiVerimli {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int sayi, i;
		boolean asalMi=true;
		System.out.println("Bir sayi giriniz: ");
		sayi = sc.nextInt();
		sc.close();
		double baslangic=System.currentTimeMillis();
		if (sayi <= 1 || sayi % 2 == 0 && sayi != 2) {
			System.out.println(sayi + " sayisi asal degildir.");
		} else if (sayi == 2) {
				System.out.println(sayi + " sayisi asaldir.");
			} else {
				for (i = 3; i <= Math.sqrt(sayi); i+=2) {
					if (sayi % i == 0) {
						asalMi = false;
						break;
					}
				}
				if (asalMi) {
					System.out.println(sayi + " sayisi asaldir.");
				} else {
					System.out.println( sayi + " sayisi asal degildir.");
				}
			}
		double bitis=System.currentTimeMillis();
		System.out.println("Islem "+((bitis-baslangic)/1000)+" saniye surdu");
	}
}