package week06.day01.InterfaceSoru1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		CalisanDB calisanDB=new CalisanDB();
		Muhendis muhendis=new Muhendis("Harun","SAKIN",50000);
		InsanKaynaklari insanKaynaklari =new InsanKaynaklari();
		insanKaynaklari.setIsim("Ece");
		insanKaynaklari.setSoyisim("Mavi");
		insanKaynaklari.setMaas(24000);
		OfisCalisani ofisCalisani=new OfisCalisani("Ali","Kaya",20000);
		Tekniker tekniker=new Tekniker();
		tekniker.setIsim("Ahmet");
		tekniker.setSoyisim("Cimen");
		tekniker.setMaas(27500);
		calisanDB.calisanlariListele();
		System.out.println("--------------");
		calisanDB.sahaCalisaniGoruntule().forEach(System.out::println);
		System.out.println("--------------");
		calisanDB.unvaniMaasaGoreAlanlariListele().forEach(System.out::println);
		System.out.println("--------------");
		calisanDB.unvaniMaasaGoreOlmayanVeSahaCalismasiYapmayanlariListele().forEach(System.out::println);
		
		
		
	}
}