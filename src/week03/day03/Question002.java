package week03.day03;

import java.util.Scanner;

/*
2- Bir metot yazal?m ve bu metot dizi içindeki tek elemanlar? al?p,
ba?ka bir diziye ats?n ve o diziyi yazd?rs?n.
 */
public class Question002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eleman sayisi giriniz :");
		int elemanSayisi = sc.nextInt();
		int[] sayilar = new int[elemanSayisi];
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println((i + 1) + ". elemani giriniz : ");
			sayilar[i] = sc.nextInt();
		}
		tekSayilariDiziyeAktar(sayilar);
	}
	public static int tekSayiAdediBul(int[] sayilar) {
		int tekSayiSayisi = 0;
		for (int sayi : sayilar) {
			if (sayi % 2 == 1) {
				tekSayiSayisi++;
			}
		}
		return tekSayiSayisi;
	}
	
	public static int[] tekSayilariDiziyeAktar(int[] sayilar) {
		int[] tekSayilar = new int[tekSayiAdediBul(sayilar)];
		int index = 0;
		for (int sayi : sayilar) {
			if (sayi % 2 == 1) {
				tekSayilar[index] = sayi;
				index++;
			}
		}
		diziYazdir(tekSayilar);
		return tekSayilar;
	}
	public static void diziYazdir(int[]sayilar){
		System.out.print("{ ");
		for (int sayi:sayilar){
			System.out.print(sayi+" ");
		}
		System.out.println("}");
	}
}