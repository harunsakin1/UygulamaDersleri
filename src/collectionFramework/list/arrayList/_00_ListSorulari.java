package collectionFramework.list.arrayList;

import java.util.*;

public class _00_ListSorulari {
	public static void main(String[] args) {
		// List olustur
		List<Ogrenci> ogrenciList=new ArrayList<>();
		
		// Ogr ekle
		Ogrenci ogrenci=new Ogrenci("Fatma","CELIK",5156);
		Ogrenci ogrenci2=new Ogrenci("Cem","ASLAN",1894);
		ogrenciList.add(new Ogrenci("Harun","SAKIN",1744));
		ogrenciList.add(new Ogrenci("Ali","KAYA",1234));
		ogrenciList.add(new Ogrenci("Mehmet","SARI",1560));
		ogrenciList.add(ogrenci);
		ogrenciList.add(ogrenci2);
		
		//List yazdir
		ogrenciList.forEach(System.out::println);
		
		//Belirli ogr'ye eris
		System.out.println(ogrenciList.get(1));
		
		//Guncelleme
		ogrenciList.set(2,new Ogrenci("Ayse","YILMAZ",3214));
		System.out.println("------GUNCEL LISTE------");
		ogrenciList.forEach(System.out::println);
		
		//Silme
		ogrenciList.remove(ogrenci);
		System.out.println("------SILDIKTEN SONRA GUNCEL LISTE------");
		ogrenciList.forEach(System.out::println);
		
		//Dongu ile gezinme
		System.out.println("----- DONGU ILE GEZINME -----");
		for (Ogrenci ogr:ogrenciList){
			System.out.println(ogr);
		}
		
		//Bos kontrolu
		String bosMu= ogrenciList.isEmpty()?"bos":"dolu";
		System.out.println(bosMu);
		
		//Baska bir listeye kopyalama
		List<Ogrenci> ogrenciListCopy=List.copyOf(ogrenciList);
		System.out.println("----- OgrenciList Copy -----");
		ogrenciListCopy.forEach(System.out::println);
		
		//Ogrenci listede var mi
		System.out.println("ogrenci2 listede var mi : ");
		System.out.println(ogrenciList.contains(ogrenci2));
		
		//Listeyi alt listeye bolme
		List<Ogrenci> ogrenciAltListe = ogrenciList.subList(0, 3);
		System.out.println("----- Ogrenci Alt Liste -----");
		ogrenciAltListe.forEach(System.out::println);
		
		//Listeyi diziye cevirme
		Ogrenci[] ogrenciDizi = ogrenciList.toArray(new Ogrenci[0]);
		System.out.println("Listenin diziye cevrilmis hali");
		System.out.println(Arrays.toString(ogrenciDizi));
		//Listeyi siralama
		Comparator<Ogrenci> comparator= (o1, o2) -> o1.getOgrNo()-o2.getOgrNo();
		Collections.sort(ogrenciList,comparator);
		System.out.println("Ogrenci numarasina gore siralanmis hali : ");
		ogrenciList.forEach(System.out::println);
		
		
		
		
		//Listeyi ters cevirme
		Collections.reverse(ogrenciList);
		System.out.println("----- Ters cevrilmis liste -----");
		ogrenciList.forEach(System.out::println);
		
		//ogr indexi bulma
		System.out.println("ogrenci2 index bulma : "+ogrenciList.indexOf(ogrenci2));
		
		//Listeyi birlestirme
		List<Ogrenci> ogrenciList2=new ArrayList<>();
		Ogrenci ogr1=new Ogrenci("Melek","DENIZ",5156);
		Ogrenci ogr2=new Ogrenci("Ali","ALTIN",1894);
		ogrenciList2.add(ogr1);
		ogrenciList2.add(ogr2);
		ogrenciList.addAll(ogrenciList2);
		System.out.println("ogrenciList ve ogrenciList2 listelerinin birlesmis hali : ");
		ogrenciList.forEach(System.out::println);
		
		
		
	}
}