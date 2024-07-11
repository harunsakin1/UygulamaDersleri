package week03.day04;

import java.util.Scanner;

/*
1- Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazal?m.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "Ý", "ý", "þ", "Þ", "ç", "Ç", "ð", "Ð", "ü", "Ü", "ö", "Ö" };
 
Örnegin;

Çadýr - > Cadir
 */
public class Question001 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir kelime giriniz : ");
		String metin=sc.nextLine();
		System.out.println(karakterDegistir(metin));
	}
	
	public static String karakterDegistir(String metin) {
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter =    { "Ý", "ý", "þ", "Þ", "ç", "Ç", "ð", "Ð", "ü", "Ü", "ö", "Ö" };
		for (int i = 0; i < turkceKarakter.length; i++) {
			metin = metin.replace(turkceKarakter[i], ingilizceKarakter[i]);
		}
		return metin;
	}
}