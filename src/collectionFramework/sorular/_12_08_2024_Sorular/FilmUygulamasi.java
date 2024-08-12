package collectionFramework.sorular._12_08_2024_Sorular;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FilmUygulamasi {
	private static Set<String> kategoriler=new HashSet<>();

	public static void main(String[] args) {
		System.out.println(kategoriEkle("Aksiyon"));
		System.out.println(kategoriEkle("Dram"));
		System.out.println(kategoriEkle("Aksiyon"));
		System.out.println(kategoriEkle("Korku"));
		System.out.println(kategoriEkle("Gerilim"));
		System.out.println(kategoriEkle("Korku"));
		
		System.out.println("Eklenen film kategorileri : "+kategoriler);
	}
	public static String kategoriEkle(String kategori) {
		if (kategoriler.add(kategori)) {
			return "Kategori baþarýyla eklendi: " + kategori;
		} else {
			return "Bu kategori zaten mevcut: " + kategori;
		}
	}
}