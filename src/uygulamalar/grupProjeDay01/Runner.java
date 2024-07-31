package uygulamalar.grupProjeDay01;

import java.util.List;
import java.util.Scanner;

public class Runner {
	static Scanner scanner = new Scanner(System.in);
	static Sepet sepet = new Sepet();
	
	public static void main(String[] args) {
		GiyimUrunleri giyim1=new GiyimUrunleri("T-shirt",150d,"T-shirt",EKategori.GIYIM,15,EBeden.M,ERenk.KIRMIZI);
		GiyimUrunleri giyim2=new GiyimUrunleri("Pantolon",250d,"Skinny Jean",EKategori.GIYIM,19,EBeden.XL,ERenk.MAVI);
		GiyimUrunleri giyim3=new GiyimUrunleri("Gomlek",350d,"Gomlek",EKategori.GIYIM,16,EBeden.M,ERenk.SIYAH);
		Yiyecek yiyecek1=new Yiyecek("Cheeseburger",150d,"Peynir ve kofte",EKategori.YIYECEK,16,EYiyecekTipi.FASTFOOD);
		Yiyecek yiyecek2=new Yiyecek("Kuru Fasulye",100d,"Kuru Fasulye",EKategori.YIYECEK,11,EYiyecekTipi.EVYEMEGI);
		Yiyecek yiyecek3=new Yiyecek("Nugget",80d,"Nugget",EKategori.YIYECEK,22,EYiyecekTipi.ATISTIRMALIK);
		Yiyecek yiyecek4=new Yiyecek("Pizza",300d,"Margarita Pizza",EKategori.YIYECEK,34,EYiyecekTipi.FASTFOOD);
		Yiyecek yiyecek5=new Yiyecek("Pilav",60d,"Pirinc Pilavi",EKategori.YIYECEK,9,EYiyecekTipi.EVYEMEGI);
		ElektronikUrunleri eUrun1 = new ElektronikUrunleri("Monitor",3000d,"Aciklama",EKategori.ELEKTRONIK, 15,5,24d, ECihazTipi.PC);
		ElektronikUrunleri eUrun2 = new ElektronikUrunleri("Telefon",10000d,"Aciklama",EKategori.ELEKTRONIK, 20,24,4d, ECihazTipi.TELEFON);
		ElektronikUrunleri eUrun3 = new ElektronikUrunleri("Kulaklik",500d,"Aciklama",EKategori.ELEKTRONIK, 25,36,5d, ECihazTipi.KULAKLIK);
		ElektronikUrunleri eUrun4 = new ElektronikUrunleri("Mouse",700d,"Aciklama",EKategori.ELEKTRONIK, 15,50,24d, ECihazTipi.PC);
		ElektronikUrunleri eUrun5 = new ElektronikUrunleri("Sarj cihazi",200d,"Aciklama",EKategori.ELEKTRONIK, 50,0, 12d, ECihazTipi.ADAPTOR);
		BakimUrunleri bakimUrun1 = new BakimUrunleri("Yuz Kremi", 350d, "Sivilce Karsiti Yagsiz Yuz Nemlendiricisi", EKategori.BAKIM, 20, EBakimUrunleriTipler.KUTU);
		BakimUrunleri bakimUrun2 = new BakimUrunleri("Vucut Losyonu", 175.50d, "Sikilastirici Vucut Losyonu", EKategori.BAKIM, 10, EBakimUrunleriTipler.SISE);
		BakimUrunleri bakimUrun3 = new BakimUrunleri("Sac Bakim Kremi ", 215.90d, "Yipranmis Saclar Icin (Reparation) Onarici Prebiyotik Sac Kremi", EKategori.BAKIM, 13, EBakimUrunleriTipler.TUP);
		BakimUrunleri bakimUrun4 = new BakimUrunleri("Gul Suyu", 65d, "% 100 Yagli Gul Suyu Dogal Katkisiz Aydinlatici Ve Gozenek Sikilastirici ", EKategori.BAKIM, 14, EBakimUrunleriTipler.SISE);
		BakimUrunleri bakimUrun5 = new BakimUrunleri("Yuz Tonik",220d, "Akne Egilimli Cilt-gozenek Sikilastirici Sebo Pure Vegetal Tonik", EKategori.BAKIM, 30, EBakimUrunleriTipler.SISE);
		AksesuarUrunleri aksesuar1 = new AksesuarUrunleri("Kolye", 100d, "Altin bir kolye. Basit ve zarif bir tasarimi var.", EKategori.AKSESUAR, 5, ETur.KOLYE, EMateryal.ALTIN, EDesen.DUZ);
		AksesuarUrunleri aksesuar2 = new AksesuarUrunleri("Saat", 200d, "Gumusten yapilmis bir saat. Cizgili desenli bir kordonu var.", EKategori.AKSESUAR, 3, ETur.SAAT, EMateryal.GUMUS, EDesen.CIZGILI);
		AksesuarUrunleri aksesuar3 = new AksesuarUrunleri("Bilezik", 150d, "Altin yapilmis duz bir bilezik. Hem sik hem de dayanikli.", EKategori.AKSESUAR, 7, ETur.BILEZIK, EMateryal.ALTIN, EDesen.DUZ);
		AksesuarUrunleri aksesuar4 = new AksesuarUrunleri("Yuzuk", 250d, "Gumus bir yuzuk. Zarif bir cizgili desenle suslenmiş.", EKategori.AKSESUAR, 4, ETur.YUZUK, EMateryal.GUMUS, EDesen.CIZGILI);
		AksesuarUrunleri aksesuar5 = new AksesuarUrunleri("Kupe", 120d, "Altindan yapilmis basit bir kupe. Gunluk kullanim icin ideal.", EKategori.AKSESUAR, 6, ETur.KUPE, EMateryal.ALTIN, EDesen.DUZ);
		
		menu();
		
	}
	
	public static void menu() {
		int secim = -1;
		do {
			System.out.println("### SEPET UYGULUMASI ###");
			System.out.println("1- Urunleri listele");
			System.out.println("2- Sepete urun ekle");
			System.out.println("3- Sepeti goruntule");
			System.out.println("4- Sepetten urun cikar");
			System.out.println("0- Cikis");
			System.out.print("Lutfen bir secim yapiniz : ");
			try {
				secim = scanner.nextInt();
			}
			catch (Exception e) {
				System.out.println("Gecerli bir secim yapiniz.");
			}
			finally {
				scanner.nextLine();
			}
			sepetFunctions(secim);
		} while (secim != 0);
	}
	
	private static int sepetFunctions(int secim) {
		switch (secim) {
			case 1: {
				Urun.urunArrayList.forEach(System.out::println);
				break;
			}
			case 2: {
				Urun.urunArrayList.forEach(System.out::println);
				System.out.print("Secmek istediginiz urunun ID'sini giriniz : ");
				int id = scanner.nextInt();
				eklenecekUrunKontrolu(UrunDB.findById(id));
				break;
			}
			case 3: {
				sepet.sepettekiUrunleriListele();
				break;
			}
			case 4: {
				sepet.sepettekiUrunleriListele();
				System.out.print("Cikartmak istediginiz urunun ID'sini giriniz : ");
				int id = scanner.nextInt();
				silinecekUrunKontrolu(UrunDB.findById(id));
				break;
			}
			case 0:{
				System.out.println("Uygulama sonlandiriliyor...");
				break;
			}
			default: {
				System.out.println("Lutfen gecerli bir secim yapiniz!");
				break;
			}
		}
		return secim;
	}
	
	private static Urun silinecekUrunKontrolu(Urun urun) {
		System.out.print("Kac adet silmek istersiniz? ");
		int silinecekAdet = scanner.nextInt();
		
		// Sepette bu urunun adetini bulalım
		int sepetAdeti = 0;
		for (Urun u : sepet.sepetList) {
			if (u.getUrunId().equals(urun.getUrunId())) {
				sepetAdeti++;
			}
		}
		
		if (silinecekAdet <= sepetAdeti) {
			for (int i = 0; i < silinecekAdet; i++) {
				sepet.sepettenUrunCikart(urun);
			}
			urun.setAdet(urun.getAdet() + silinecekAdet);
			System.out.println(urun.getAd() + " adli urunden " + silinecekAdet + " adet sepetten cikarildi.");
			return urun;
		} else {
			for (int i = 0; i < sepetAdeti; i++) {
				sepet.sepettenUrunCikart(urun);
			}
			urun.setAdet(urun.getAdet() + sepetAdeti);
			System.out.println("Silmek istediginiz adetten daha az urun bulunuyor. Sepetteki urunlerin tamami cikarildi.");
		}
		return null;
	}
	
	private static Urun eklenecekUrunKontrolu(Urun urun) {
		System.out.println(urun.urunDetayBilgisi());
		System.out.print("Kac adet eklemek istersiniz ?");
		int adet = scanner.nextInt();
		if (adet <= urun.getAdet()) {
			for (int j = 0; j < adet; j++) {
				sepet.sepeteUrunEkle(urun);
			}
			urun.setAdet(urun.getAdet() - adet);
			System.out.println(urun.getAd() + " adli urunden " + adet + " adet eklendi.");
			return urun;
		}
		else {
			System.out.println("Yeterli stok bulunamadi!");
		}
		return null;
	}
	
}