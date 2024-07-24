/*
package week04.kullanici_kayit_sistemi.refactored;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class KullaniciKayitSistemi {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		int secim = 0;
		do {
			System.out.println("### KULLANICI KAYIT SISTEMI ###");
			System.out.println("1- Kayit Ol");
			System.out.println("2- Kayit Goruntule");
			System.out.println("3- Giris Yap");
			System.out.println("4- Sifremi Unuttum");
			System.out.println("0- Cikis");
			System.out.print("Lutfen bir secim yapiniz : ");
			secim = scanner.nextInt();
			scanner.nextLine();
			durum(secim);
			
			
		} while (secim != 0);
		
	}
	
	private static void durum(int secim) {
		switch (secim) {
			case 1: {
//                int i=0;
				Kullanici kullanici = kullaniciKaydi();
//                kayitlar[i]=kullanici;
//                i++;
				KullaniciDB.save(kullanici);
				break;
			}
			case 2: {
				KullaniciDB.findAll();
				break;
			}
			case 3: {
				KullaniciDB.girisYap(girisKullaniciAdi(), girisSifre());
				break;
			}
			case 4: {
				KullaniciDB.sifremiUnuttum(girisKullaniciAdi(), sifremiUnuttumMail(), sifremiUnuttumTC());
				break;
			}
		}
	}
	
	private static Kullanici kullaniciKaydi() {
		LocalDate dogumTarihi;
		Kullanici kullanici;
		dogumTarihi = dogumTarihiAl();
		if (dogumTarihKontrol(dogumTarihi)) {
			//Dogum tarihini kontrolunu gectik, o zaman kullanici olusturabiliriz.
			kullanici = new Kullanici();
			kullanici.setDogumTarihi(dogumTarihi);
			
			String[] isimSoyisim = isimSoyisimAl();
			kullanici.setIsim(isimSoyisim[0]);
			kullanici.setSoyisim(isimSoyisim[1]);
			kullanici.setEmail(emailAl());
			kullanici.setTelNo(telNoAl());
			kullanici.setSifre(sifreAl());
			kullanici.setKullaniciAdi(kullaniciAdiAl());
			kullanici.setTcKimlik(tcKimlikAl());
			
			
			return kullanici;
		}
		else {
			System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
		}
		return null;
	}
	
	private static String girisKullaniciAdi() {
		System.out.print("Kullanici adi : ");
		String kullaniciAd = scanner.nextLine();
		return kullaniciAd;
	}
	
	private static String girisSifre() {
		System.out.print("Sifre : ");
		String sifre = scanner.nextLine();
		return sifre;
	}
	
	private static String sifremiUnuttumMail() {
		System.out.print("Mail adresiniz : ");
		String mail = scanner.nextLine();
		return mail;
	}
	
	private static String sifremiUnuttumTC() {
		System.out.print("TC kimlik numaraniz : ");
		String tc = scanner.nextLine();
		return tc;
	}
	
	private static String tcKimlikAl() {
		String tcKimlik;
		while (true) {
			System.out.print("Lutfen TC kimlik numaranizi giriniz : ");
			tcKimlik = scanner.nextLine();
			if (tcKimlik.length() != 11) {
				System.out.println("TC Kimlik No 11 haneli olmalidir.");
				continue;
			}
			else if (!numerikDegerKontrol(tcKimlik)) {
				System.out.println("TC Kimlik No sadece numerik karakterler barindirabilir. ");
				continue;
			}
			else if (KullaniciDB.tcVarMi(tcKimlik)) {
				System.out.println("Girdiginiz TC Kimlik no baska bir kullanici tarafindan kullaniliyor.");
				continue;
			}
			return tcKimlik;
		}
	}
	
	private static boolean numerikDegerKontrol(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static String kullaniciAdiAl() {
		
		String kullaniciAdi;
		while (true) {
			System.out.print("Lutfen bir kullanici adi giriniz min 4 - max 16 karakter : ");
			kullaniciAdi = scanner.nextLine();
			if (kullaniciAdi.length() < 4) {
				System.out.println("Kullanici adi 4 karakterden kisa olamaz.");
				continue;
			}
			else if (kullaniciAdi.length() > 16) {
				System.out.println("Kullanici adi 16 karakterden uzun olamaz.");
				continue;
			}
			else if (KullaniciDB.kullaniciAdiVarMi(kullaniciAdi)) {
				System.out.println("Girdiginiz kullanici adi baska bir uye tarafindan kullaniliyor.");
				continue;
			}
			return kullaniciAdi;
		}
	}
	
	
	public static String sifreAl() {
		String sifre;
		String sifreYeniden;
		while (true) {
			System.out.print("Lutfen bir sifre giriniz min 8 - max 32 karakter : ");
			sifre = scanner.nextLine();
			if (sifre.length() < 8) {
				System.out.println("Sifre 8 karakterden kisa olamaz.");
				continue;
			}
			else if (sifre.length() > 32) {
				System.out.println("Sifre 32 karakterden uzun olamaz.");
				continue;
			}
			else {
				System.out.print("Lutfen sifreninizi tekrar giriniz : ");
				sifreYeniden = scanner.nextLine();
				if (sifre.equals(sifreYeniden)) {
					return sifre;
				}
				else {
					System.out.println("Girdiginiz sifreler eslesmiyor! ");
				}
			}
		}
		
	}
	
	private static String telNoAl() {
		while (true) {
			System.out.print("Lutfen telefon numaranizi giriniz : +90 ");
			String telNo = scanner.nextLine();
			if (telNo.length() != 10 || telNo.startsWith("0")) {
				System.out.println("Telefon numarasi 10 haneli olmalidir ve ilk hanesi 0'dan farkli olmalidir.");
				continue;
			}
			else if (KullaniciDB.telNoVarMi(telNo)) {
				System.out.println("Girdiginiz telefon numarasi baskasi tarafindan kullanilmaktadir.");
				continue;
			}
			return telNo;
		}
	}
	
	private static String emailAl() {
		String email;
		while (true) {
			System.out.print("Lutfen mailinizi giriniz : ");
			email = scanner.nextLine();
			if ((!email.contains("@")) || (!email.endsWith(".com"))) {
				System.out.println("Lutfen gecerli bir mail adresi giriniz.");
				continue;
			}
			else if (KullaniciDB.mailVarMi(email)) {
				System.out.println("Girdiginiz email kullanilmaktadir.");
				continue;
			}
			return email;
		}
	}
	
	private static String[] isimSoyisimAl() {
		String[] isimSoyisim = new String[2];
		System.out.print("Lutfen adinizi giriniz : ");
		isimSoyisim[0] = scanner.nextLine();
		System.out.print("Lutfen soyadinizi giriniz : ");
		isimSoyisim[1] = scanner.nextLine();
		return isimSoyisim;
	}
	
	private static LocalDate dogumTarihiAl() {
		while (true) {
			System.out.print("Lutfen dogum tarihinizi giriniz (yyyy-MM-dd) : ");
			String date = scanner.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			}
			catch (Exception e) {
				System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz!!!\n");
			}
		}
	}
	
	private static boolean dogumTarihKontrol(LocalDate date) {
		int yas = Period.between(date, LocalDate.now()).getYears();
		boolean resitMi = (yas < 18) ? false : true;
		return resitMi;
	}
}*/