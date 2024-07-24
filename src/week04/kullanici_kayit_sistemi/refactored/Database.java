package week04.kullanici_kayit_sistemi.refactored;

public class Database<T> {
	OzelListe ozelListe=new OzelListe();
	T save(T t){
		return (T) ozelListe.add(t);
	}
	
	T[] saveAll(T[] dataArr){
		return (T[]) ozelListe.addAll(dataArr);
	}
	
	T[] findAll(){
		T[] veriDizisi = (T[]) ozelListe.getVeriDizisi();
		for(T t : veriDizisi){
			System.out.println(t);
		}
		return veriDizisi;
	}
}