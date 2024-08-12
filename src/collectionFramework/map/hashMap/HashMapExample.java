package collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,String> languageHashMap=new HashMap<>();
		languageHashMap.put(1,"Turkce"); // -> entrySet (Girdi kümesi)
		languageHashMap.put(2,"Ingilizce");
		languageHashMap.put(3,"Almanca");
		System.out.println(languageHashMap);
		languageHashMap.put(3,"Fransizca");
		System.out.println(languageHashMap);
		
		System.out.println("Key'i 2 olan deger (languageHashMap.get(2)) : "+languageHashMap.get(2));
		System.out.println("Key'lerin set hali : (languageHashMap.keySet()) "+languageHashMap.keySet());
		System.out.println("Value'lerin Collection hali (languageHashMap.values()) : "+languageHashMap.values());
		System.out.println("languageHashMap'in girdilerinin set hali : (languageHashMap.entrySet()) "+languageHashMap.entrySet());
		System.out.println("Key varsa deðerini döner, yoksa Not Found döner : (languageHashMap.getOrDefault(3,\"Not Found\")) "+languageHashMap.getOrDefault(3,"Not Found"));
		System.out.println("Key var mi yok mu kontrolu : (languageHashMap.containsKey(2)) "+languageHashMap.containsKey(2));
		System.out.println("Value var mi yok mu kontrolu : (languageHashMap.containsValue(\"Fransizca\")) "+languageHashMap.containsValue("Fransizca"));
		System.out.println("Belli bir keydeki value'yi degistirmek icin : (languageHashMap.replace(2,\"Italyanca\") "+languageHashMap.replace(2,"Italyanca"));
		languageHashMap.replaceAll((k,v)->v.toUpperCase());
		System.out.println("Value'larin hepsini degistirmek icin : (languageHashMap.replaceAll((k,v)->v.toUpperCase());)"+languageHashMap);
		System.out.println("Bir entry'i silmek icin : (languageHashMap.remove(3))"+languageHashMap.remove(3));
		
		languageHashMap.put(3,"FRANSIZCA");
		languageHashMap.put(4,"ISPANYOLCA");
		languageHashMap.put(5,"ALMANCA");
		System.out.println(languageHashMap);
		for (Map.Entry<Integer,String> entry:languageHashMap.entrySet()){
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
		}
		
	}
}