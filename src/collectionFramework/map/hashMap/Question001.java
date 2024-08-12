package collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Question001 {
	public static void main(String[] args) {
		Map<Integer, Map<String,Map<Integer,Map<String,String>>>> tumMaplar=new HashMap<>();
		Map<String,String> enIctekiMap=new HashMap<>();
		Map<String,String> enIctekiMap2=new HashMap<>();
		Map<String,String> enIctekiMap3=new HashMap<>();
		
		enIctekiMap.put("Harun","SAKIN");
		enIctekiMap.put("Baris","CELIK");
		enIctekiMap2.put("Ahmet","YILMAZ");
		enIctekiMap2.put("Burak","AYDIN");
		enIctekiMap3.put("Ali","SARI");
		enIctekiMap3.put("Mehmet","YESIL");
		
		Map<Integer, Map<String, String>> enIctekindenBirOncekiMap = new HashMap<>();
		Map<Integer, Map<String, String>> enIctekindenBirOncekiMap2 = new HashMap<>();
		Map<Integer, Map<String, String>> enIctekindenBirOncekiMap3 = new HashMap<>();
		
		enIctekindenBirOncekiMap.put(1, enIctekiMap);
		enIctekindenBirOncekiMap2.put(2, enIctekiMap2);
		enIctekindenBirOncekiMap3.put(3, enIctekiMap3);
		
		Map<String, Map<Integer, Map<String, String>>> enIctekindenBirOncekindenBirOncekiMap = new HashMap<>();
		Map<String, Map<Integer, Map<String, String>>> enIctekindenBirOncekindenBirOncekiMap2 = new HashMap<>();
		Map<String, Map<Integer, Map<String, String>>> enIctekindenBirOncekindenBirOncekiMap3 = new HashMap<>();
		
		enIctekindenBirOncekindenBirOncekiMap.put("Bursa", enIctekindenBirOncekiMap);
		enIctekindenBirOncekindenBirOncekiMap2.put("Isparta", enIctekindenBirOncekiMap2);
		enIctekindenBirOncekindenBirOncekiMap3.put("Ankara", enIctekindenBirOncekiMap3);

		
		
		tumMaplar.put(16, enIctekindenBirOncekindenBirOncekiMap);
		tumMaplar.put(32, enIctekindenBirOncekindenBirOncekiMap2);
		tumMaplar.put(6, enIctekindenBirOncekindenBirOncekiMap3);
		
		
		
		
		System.out.println(tumMaplar);
		
//		for (Map.Entry<Integer,Map<String,String>> entry:mapOfMap.entrySet()){
//			System.out.println("Distaki Map'in Key'i : "+entry.getKey());
//			System.out.println("Distaki Map'in Value'su : ");
//			for (Map.Entry<String,String> insideEntry:entry.getValue().entrySet()){
//				System.out.println("Icteki Map'in Key'i : "+insideEntry.getKey());
//				System.out.println("Icteki Map'in Value'su : "+insideEntry.getValue());
//			}
//		}
		for (Map.Entry<Integer, Map<String,Map<Integer,Map<String,String>>>> enDistakiEntry: tumMaplar.entrySet()){
			System.out.println("En distaki Map'in Key'i : "+enDistakiEntry.getKey());
			//System.out.println("En distaki Map'in Value'su : ");
			for (Map.Entry<String,Map<Integer,Map<String,String>>>enDistanBiOncekiEntry:
					enIctekindenBirOncekindenBirOncekiMap.entrySet()){
				System.out.println("    En distan bi onceki Map'in Key'i : "+enDistanBiOncekiEntry.getKey());
				//System.out.println("En distan bi onceki Map'in Value'su : ");
				for (Map.Entry<Integer,Map<String,String>>enDistanBiOncekindenBiOncekiEntry:
						enIctekindenBirOncekiMap.entrySet()){
					System.out.println("        En distan bi oncekinden bi onceki Map'in Key'i : "+enDistanBiOncekindenBiOncekiEntry.getKey());
					//System.out.println("En distan bi oncekinden bi onceki Map'in Value'su : ");
					for (Map.Entry<String,String>enIctekiEntry: enIctekiMap.entrySet()){
						System.out.println("            En icteki Map'in Key'i : "+enIctekiEntry.getKey());
						System.out.println("            En icteki Map'in Value'su : "+enIctekiEntry.getValue());
					}
				}
			}
		}
	}
}