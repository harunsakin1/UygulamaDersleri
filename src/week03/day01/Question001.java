package week03.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean durum = true;
		int secim;
		while (durum) {
			System.out.println("\n1-Kelime icerisinde harf arama\n2-Kelime icerisinde harf degistirme\n3-Palindrom " +
					                   "kontrolu\n4-Kelimelerin ilk harflerine gore siralama\n0-Cikis");
			System.out.print("Bir secim yapiniz : ");
			try {
				secim=sc.nextInt();
			}
			catch (InputMismatchException e){
				System.out.println("\nLutfen sadece sayi giriniz!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (secim) {
				case 1: {
					System.out.println("\n KELIME ICERISINDE HARF ARAMA");
					System.out.print("Bir Kelime giriniz : ");
					String kelime = sc.nextLine();
					System.out.print("Kelime icerisinde aranacak bir harf giriniz : ");
					char harf = sc.nextLine().charAt(0);
					int sayac = 0;
					if (!kelime.contains(String.valueOf(harf))){
						System.out.println("\n Aradiginiz harf yok!");
						break;
					}
					for (int i = 0; i <kelime.length() ; i++) {
						if (kelime.charAt(i)==harf){
							sayac++;
							System.out.println(harf+" harfi "+i+". indexte");
						}
					}
					System.out.println(kelime+" kelimesinde "+sayac+" tane "+harf+" harfi bulunmaktadir.");
					break;
				}
				case 2:{
					System.out.println("Bir kelime giriniz : ");
					String kelime=sc.next();
					System.out.println("Kelime icerisinde degistirilecek harfi giriniz : ");
					char degistirilecekHarf=sc.next().charAt(0);
					System.out.println("Hangi harf ile degistirilsin : ");
					char hangiHarf=sc.next().charAt(0);
					String donusturulmusKelime=kelime.replace(degistirilecekHarf,hangiHarf);
					System.out.println("Eski kelime : "+kelime+" \nYeni Kelime : "+donusturulmusKelime);
					break;
				}
				case 3:{
					System.out.println("Kelime giriniz : ");
					String kelime=sc.nextLine().toLowerCase();
					String tersKelime="";
					
					for (int i = kelime.length()-1; i >=0 ; i--) {
						tersKelime+=kelime.charAt(i);
					}
					System.out.println("Ters cevrilmis kelime : "+tersKelime);
					if (kelime.equalsIgnoreCase(tersKelime)){
						System.out.println(kelime+" kelimesi palindromdur.");
					}
					else {
						System.out.println(kelime+" kelimesi palindrom degildir.");
					}
					break;
				}
				case 4:{
				int a=0,b=0,c=0,d=0,toplam=0;
					System.out.println("5 Adet kelime giriniz : ");
					for (int i = 0; i <5 ; i++) {
						System.out.print((i+1)+". kelimeyi giriniz : ");
						String kelime = sc.nextLine();
						if (kelime.charAt(0) == 'a') {
							a = 1;
						} else if (kelime.charAt(0) == 'b') {
							b = 1;
						} else if (kelime.charAt(0) == 'c') {
							c = 1;
						} else {
							d += 1;
						}
					}
					toplam=a+b+c+d;
					System.out.println("Toplam sayfa sayisi : "+toplam);
					break;
				}
				case 0:{
					System.out.println("Program sonlandiriliyor . ");
					durum=false;
					System.exit(1);
				}
				default:{
					System.out.println("Lutfen gecerli bir menu secenegini seciniz : ");
				}
			}
		}
	}
}