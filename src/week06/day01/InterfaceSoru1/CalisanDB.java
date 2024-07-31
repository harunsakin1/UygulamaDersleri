package week06.day01.InterfaceSoru1;

import java.util.ArrayList;
import java.util.List;

public class CalisanDB {
	
	static ArrayList<Calisan> calisanListesi=new ArrayList<>();
	
	public Calisan save( Calisan calisan){
		if (calisanListesi.add(calisan)){
			return calisan;
		}
		else {
			return null;
		}
	}
	
	
	public ArrayList<Calisan> calisanlariListele(){
		
			System.out.println(calisanListesi);
		
		return calisanListesi;
	}
	
	public List<SahaCalismasiYapabilir> sahaCalisaniGoruntule(){
		List<SahaCalismasiYapabilir> sahaCalismasiYapabilirListesi=new ArrayList<>();
		System.out.println("Saha calisani olanlar");
		for (int i = 0; i < calisanListesi.size(); i++) {
			if (calisanListesi.get(i) instanceof SahaCalismasiYapabilir){
				sahaCalismasiYapabilirListesi.add((SahaCalismasiYapabilir) calisanListesi.get(i));
			}
		}
		return sahaCalismasiYapabilirListesi;
	}
	
	public List<MaasaGoreUnvanAlabilir> unvaniMaasaGoreAlanlariListele(){
		List<MaasaGoreUnvanAlabilir> maasaGoreUnvanAlabilirListesi=new ArrayList<>();
		System.out.println("Unvani maasa gore olanlar");
		for (int i = 0; i < calisanListesi.size(); i++) {
			if (calisanListesi.get(i) instanceof MaasaGoreUnvanAlabilir){
				maasaGoreUnvanAlabilirListesi.add((MaasaGoreUnvanAlabilir) calisanListesi.get(i));
			}
		}
		return maasaGoreUnvanAlabilirListesi;
	}
	
	public List<Sozlesmesizler> unvaniMaasaGoreOlmayanVeSahaCalismasiYapmayanlariListele(){
		List<Sozlesmesizler> sozlesmesiOlmayanlarListesi=new ArrayList<>();
		System.out.println("Unvani maasa gore olmayan ve saha calismasi yapmayanlar");
		for (int i = 0; i < calisanListesi.size(); i++) {
			if (calisanListesi.get(i) instanceof Sozlesmesizler ){
				sozlesmesiOlmayanlarListesi.add((Sozlesmesizler) calisanListesi.get(i));
				//System.out.println(calisanListesi.get(i));
			}
		}
		return sozlesmesiOlmayanlarListesi;
	}
}