package week04.day04;

class KullaniciDB {
	static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	
	static Kullanici save(Kullanici kullanici) {
		return kullaniciOzelListe.add(kullanici);
		
	}
	
	static Kullanici[] findAll() {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi != null) {
			for (Kullanici kullanici : kullaniciDizisi) {
				System.out.println(kullanici);
			}
		}
		else {
			System.out.println("Kayitli kullanici bulunamadi!");
		}
		return kullaniciDizisi;
	}
	
	static void girisYap(String kullaniciAdi, String sifre) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		boolean girisYapildiMi=false;
		if (kullaniciDizisi != null) {
			for (int i = 0; i < kullaniciDizisi.length; i++) {
				if (kullaniciDizisi[i].getKullaniciAdi().equals(kullaniciAdi) &&
						kullaniciDizisi[i].getSifre().equals(sifre)) {
					System.out.println("Basariyla giris yaptiniz.");
					System.out.println("Hosgeldin "+kullaniciDizisi[i].getKullaniciAdi());
					girisYapildiMi=true;
					break;
				}
			}
			if (!girisYapildiMi){
				System.out.println("Kullanici adi veya sifre hatali!");
			}
		}
		else {
			System.out.println("Kayitli kullanici yok. Once kayit olabilirsiniz.");
		}
	}
	
	static void sifremiUnuttum(String kullaniciAdi, String email, String tcKimlik) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		boolean sifreDegistirildiMi=false;
		if (kullaniciDizisi != null) {
			for (int i = 0; i < kullaniciDizisi.length; i++) {
				if (kullaniciDizisi[i].getKullaniciAdi().equals(kullaniciAdi) && kullaniciDizisi[i].getEmail().equals(email) && kullaniciDizisi[i].getTcKimlik().equals(tcKimlik)) {
					kullaniciDizisi[i].setSifre(KullaniciKayitSistemi.sifreAl());
					System.out.println(kullaniciDizisi[i].getKullaniciAdi()+" kullanici adli kullanicinin sifresi " + "basariyla degistirildi.");
					sifreDegistirildiMi=true;
					break;
				}
			}
			if (!sifreDegistirildiMi){
				System.out.println("Lutfen tum bilgileri dogru giriniz.");
			}
		}
		else {
			System.out.println("Kayitli kullanici yok. Once kayit olabilirsiniz.");
		}
	}
	
	static boolean mailVarMi(String email) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi != null) {
			for (Kullanici kullanici : kullaniciDizisi) {
				if (kullanici.getEmail().equals(email)) {
					return true;
				}
			}
		}
		return false;
	}
	
	static boolean kullaniciAdiVarMi(String kullaniciAdi) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi != null) {
			for (Kullanici kullanici : kullaniciDizisi) {
				if (kullanici.getKullaniciAdi().equals(kullaniciAdi)) {
					return true;
				}
			}
		}
		return false;
	}
	
	static boolean tcVarMi(String tcNo) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi != null) {
			for (Kullanici kullanici : kullaniciDizisi) {
				if (kullanici.getTcKimlik().equals(tcNo)) {
					return true;
				}
			}
		}
		return false;
	}
	
	static boolean telNoVarMi(String telNo) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi != null) {
			for (Kullanici kullanici : kullaniciDizisi) {
				if (kullanici.getTelNo().equals(telNo)) {
					return true;
				}
			}
		}
		return false;
	}
}