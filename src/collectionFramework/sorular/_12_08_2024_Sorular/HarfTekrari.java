package collectionFramework.sorular._12_08_2024_Sorular;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HarfTekrari {
	static Map<Character,Integer> kelimedekiHarflerMap=new LinkedHashMap<>();
	public static void main(String[] args) {
	harfSayisiBul("qwezxczxcasd");
	}
	private static void harfSayisiBul(String kelime){
		char[] kelimeCharArray = kelime.toCharArray();
		for (int i = 0; i < kelimeCharArray.length; i++) {
			kelimedekiHarflerMap.put(kelimeCharArray[i],kelimedekiHarflerMap.getOrDefault(kelimeCharArray[i],0)+1);
		}
		for (Map.Entry<Character,Integer> entry: kelimedekiHarflerMap.entrySet()){
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}