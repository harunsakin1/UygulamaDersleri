package week03.day03;

import java.util.Scanner;

public class Deneme {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean kontrol=true;
		boolean icMenuKontrol;
		while (kontrol){
			System.out.println("Turkce --> 1 // Enlish --> 2 // 0-Cikis/Exit");
			System.out.println("Lutfen bir secim yapiniz : ");
			int secim=sc.nextInt();
			icMenuKontrol=true;
			switch (secim){
				case 1:{
					
					do {
						System.out.println("Turkce sayfasi\n");
						System.out.println("0-- Cikis Yap");
						System.out.println("1-- Turkce'den Ingilizce'ye ceviri");
						System.out.println("2-- Ingilizce'den Turkce'ye ceviri");
						System.out.println("3-- Kelime permutasyonu hesaplama");
						System.out.println("4-- Dil secim ekrani");
						System.out.println("Seciminiz : ");
						int secim2=sc.nextInt();
						switch (secim2){
							case 1:{
								System.out.println("##### Turkce'den Ingilizce'ye ceviri sayfasi #####");
								String[] ingilizceKelimeler={"apple","yellow","pen","dog","keyboard"};
								String[] turkceKelimeler={"elma","sari","kalem","kopek","klavye"};
								System.out.println("Turkce bir kelime giriniz : ");
								sc.nextLine();
								String kelime=sc.nextLine();
								
								for (int i = 0; i < turkceKelimeler.length ; i++) {
									if (turkceKelimeler[i].equalsIgnoreCase(kelime)){
										System.out.println(turkceKelimeler[i]+" kelimesinin ingilizcesi : "+ingilizceKelimeler[i]);
									}
								}
								break;
							}
							case 2:{
								System.out.println("##### Ingilizce'den Turkce'ye ceviri sayfasi #####");
								String[] ingilizceKelimeler={"apple","yellow","pen","dog","keyboard"};
								String[] turkceKelimeler={"elma","sari","kalem","kopek","klavye"};
								System.out.println("Ingilizce bir kelime giriniz : ");
								sc.nextLine();
								String kelime=sc.nextLine();
								for (int i = 0; i < ingilizceKelimeler.length ; i++) {
									if (ingilizceKelimeler[i].equalsIgnoreCase(kelime)){
										System.out.println(ingilizceKelimeler[i]+" kelimesinin turkcesi : "+turkceKelimeler[i]);
									}
								}
								break;
							}
							case 3:{
								System.out.println("##### Kelime permutasyonu hesaplama sayfasi #####\n");
								System.out.println("Permutasyonu hesaplanacak kelimeyi giriniz : ");
								sc.nextLine();
								String kelime=sc.nextLine();
								permute(kelime);
								break;
							}
							case 4:{
								icMenuKontrol=false;
								break;
							}
							case 0:{
								System.out.println("Program sonlandiriliyor.");
								System.exit(1);
								break;
							}
							default:{
								System.out.println("Lutfen gecerli bir secim yapiniz!");
							}
						}
						
					}while (icMenuKontrol);
					break;
				}
				case 2:{
					System.out.println("English page\n");
					break;
				}
				case 0:{
					System.out.println("Uygulama sonlandiriliyor.");
					kontrol=false;
					break;
				}
				default:{
					System.out.println("Gecerli bir secim yapiniz");
				}
			}
			
		}
	}
	public static void permute(String str) {
		int n = str.length();
		int[] factorial = new int[n + 1];
		factorial[0] = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial[i] = factorial[i - 1] * i;
		}
		
		for (int i = 0; i < factorial[n]; i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			
			for (int div = n; div >= 1; div--) {
				int q = temp / div;
				int r = temp % div;
				
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				
				temp = q;
			}
			
			System.out.println();
		}
	}
}