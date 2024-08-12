package collectionFramework.sorular._12_08_2024_Sorular;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
4- Aþaðýdaki öðrencileri, notlar ile çaprazlayalým.
String[] ogrenci = { "Ayse", "Ece", "Mahmut" };
int[][] notlar = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } }
 */
public class OgrenciNotCaprazlama {
	public static void main(String[] args) {
		String[] ogrenci = { "Ayse", "Ece", "Mahmut" };
		int[][] notlar = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } };
		Map<String,int[]> ogrenciNotlari=new HashMap<>();
		
		for (int i = 0; i < ogrenci.length; i++) {
			ogrenciNotlari.put(ogrenci[i], (notlar[i]));
		}
		for (Map.Entry<String,int[]>entry:ogrenciNotlari.entrySet()){
			System.out.println(entry.getKey()+" ----> "+ Arrays.toString(entry.getValue()));
		}
		
	}
}