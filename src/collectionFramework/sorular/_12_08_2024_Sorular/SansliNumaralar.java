package collectionFramework.sorular._12_08_2024_Sorular;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SansliNumaralar {
	static Random rnd=new Random();
	static Map<Integer,Integer> sayiVeSayiAdetleriMap =new HashMap<>();
	static List<Integer> sayilarinListesi=new ArrayList<>();
	static Set<Integer> listedenCekilenSayilarSet =new HashSet<>();
	static List<Integer> ellidenBuyukSayilarListesi=new ArrayList<>();
	
	
	public static void main(String[] args) {
		rastgeleSayiUret();
			listeyeSayiSayisiKadarSayiEkle();
		listedenRastgeleSayiCek();
		ellidenBuyukSansliSayilariYazdirma();
		tumSansliNumaralarToplami();
		ellidenBuyukSansliNumaralarToplami();
	}
	
	
	private static void rastgeleSayiUret(){
		sayiVeSayiAdetleriMap=
				IntStream.range(0,10000).mapToObj(i->rnd.nextInt(1,101)).collect(Collectors.groupingBy(sayi->sayi,Collectors.summingInt(s->1)));
		for (Map.Entry<Integer,Integer> entry:sayiVeSayiAdetleriMap.entrySet()){
			System.out.println(entry.getKey()+" sayisindan "+ entry.getValue()+" adet var.");
		}
	}
	private static void listeyeSayiSayisiKadarSayiEkle(){
		for (Map.Entry<Integer,Integer>entry: sayiVeSayiAdetleriMap.entrySet()){
			if (Optional.ofNullable(entry).isPresent()) {
				for (int i = 0; i < entry.getValue() ; i++) {
					sayilarinListesi.add(entry.getKey());
				}
			}
			else {
				System.out.println("Map'in entrySet'i alinamadi.");
				break;
			}
			//System.out.println(sayilarinListesi);
		}
	}
	private static void listedenRastgeleSayiCek(){
		while (listedenCekilenSayilarSet.size()<10){
			listedenCekilenSayilarSet=
					IntStream.range(0,10).mapToObj(i->sayilarinListesi.get(rnd.nextInt(sayilarinListesi.size()))).collect(Collectors.toSet());
		}
		
		System.out.println("Listeden rastgele cekilen 10 tane sayi : "+ listedenCekilenSayilarSet);
	}
	
	private static void ellidenBuyukSansliSayilariYazdirma(){
		System.out.println("50'den buyuk sayilar : ");
		listedenCekilenSayilarSet.stream()
		                         .filter(sayi -> sayi > 50)
		                         .peek(System.out::println)
		                         .forEach(ellidenBuyukSayilarListesi::add);
	}
	private static void tumSansliNumaralarToplami(){
		Optional<Integer> sonuc = listedenCekilenSayilarSet.stream()
		                                                    .reduce(Integer::sum);
		if (sonuc.isPresent()) {
			System.out.println("Tum sansli numaralarin toplami : "+sonuc.get());
		}
		else {
			System.out.println("Sansli sayilar listeden alinamadi.");
		}
		
	}
	private static void ellidenBuyukSansliNumaralarToplami(){
		Optional<Integer> sonuc = ellidenBuyukSayilarListesi.stream()
		                                                    .reduce(Integer::sum);
		if (sonuc.isPresent()) {
			System.out.println("50'den buyuk sayilarin toplami : "+sonuc.get());
		}
		else {
			System.out.println("50'den buyuk sayilar listeden alinamadi.");
		}
	}
 
}