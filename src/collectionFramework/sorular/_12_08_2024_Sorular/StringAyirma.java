package collectionFramework.sorular._12_08_2024_Sorular;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringAyirma {
	static Set<Character> tekrarEdenler = new LinkedHashSet<>();
	static Set<Character> tekrarEtmeyenler = new LinkedHashSet<>();
	
	public static void main(String[] args) {
		harfleriKontrolEt("abcdeftfe");
	}
	
	public static void harfleriKontrolEt(String deger) {
		for (char item : deger.toCharArray()) {
			if (!tekrarEdenler.contains(item) && !tekrarEtmeyenler.contains(item)) {
				tekrarEtmeyenler.add(item);
			} else {
				tekrarEtmeyenler.remove(item);
				tekrarEdenler.add(item);
			}
		}
		System.out.println("Tekrar eden harfler: " + tekrarEdenler);
		System.out.println("Tekrar etmeyen harfler: " + tekrarEtmeyenler);
	}
	
	
}