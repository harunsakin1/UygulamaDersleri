package uygulamalar.grupProje_1.kullaniciIslemleri;


import uygulamalar.grupProje_1.kullaniciIslemleri.databases.KullaniciDB;
import uygulamalar.grupProje_1.kullaniciIslemleri.databases.MailDB;
import uygulamalar.grupProje_1.kullaniciIslemleri.databases.SmsDB;
import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Kullanici;
import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Mail;
import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Sms;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class KullaniciKayitSistemi {
	
	static Scanner scanner = new Scanner(System.in);
    static KullaniciDB kullaniciDB = new KullaniciDB();
	static MailDB mailDB=new MailDB();
	static SmsDB smsDB=new SmsDB();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int secim = -1;
        do {
                System.out.println("### KULLANICI KAYIT SISTEMI ###");
                System.out.println("1- Kayit Ol");
                System.out.println("2- Giris Yap");
                System.out.println("3- Sifremi Unuttum");
                System.out.println("8- Demo veri olustur");
                System.out.println("9- Kullanicilari Goruntule");
                System.out.println("0- Cikis");
                System.out.print("Lutfen bir secim yapiniz : ");
                try {
                    secim = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Gecerli bir secim yapiniz.");
                } finally {
                    scanner.nextLine();
                }
                menuFunctions(secim);
        } while (secim != 0);
    }

    private static void menuFunctions(int secim) {
        switch (secim) {
            case 1: {
                Kullanici kullanici = kullaniciKaydi();
                break;
            }
            case 2: {
                Kullanici kullanici = girisYap();
                if (kullanici != null){
                    kullaniciArayuzu(kullanici);
                }
                break;
            }
            case 3: {
                sifremiUnuttum();
                break;
            }
            case 8: {
                generateData();
                break;
            }
            case 9: {
               kullanicilariGoruntule();
               break;
            }
            case 0: {
                System.out.println("Program Sonlandirildi...");
                break;
            }
        }
    }

    private static void kullaniciArayuzu(Kullanici kullanici) {
        int secim = -1;
        do {
			/*
			System.out.println("2- Gonderilen mailleri Goruntule");
            System.out.println("3- Alinan mailleri Goruntule");
	        System.out.println("4- Mail Gonder");
			 */
            System.out.println("### KULLANICI ARAYUZU ###");
            System.out.println("1- Bilgilerimi Goruntule");
	        System.out.println("2- MAIL");
	        System.out.println("3- SMS");
	        System.out.println("7- TelNo Degistir");
            System.out.println("8- Email Degistir");
            System.out.println("9- Sifre Degistir");
            System.out.println("0- Oturumu Sonlandir");
            System.out.print("Lutfen bir secim yapiniz : ");
            try {
                secim = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Gecerli bir secim yapiniz.");
            } finally {
                scanner.nextLine();
            }
            secim = userMenuFunctions(secim,kullanici);
        } while (secim != 0);

    }

    private static int userMenuFunctions(int secim, Kullanici kullanici) {
        switch (secim) {
            case 1: {
                kullaniciyiGoruntule(kullanici.getId());
                break;
            }
	        case 2:{
				mailArayuzu(kullanici);
		        System.out.println("mail");
				break;
	        }
	        case 3:{
				smsArayuzu(kullanici);
				break;
	        }
            case 7: {
                telNoDegistir(kullanici);
                break;
            }
            case 8: {
                emailDegistir(kullanici);
                break;
            }
            case 9: {
                if (sifreDegistir(kullanici)){
                    System.out.println("Sifrenizi basariyla degistirdiniz. Lutfen tekrar giris yapiniz... ");
                    return 0;
                }
                break;
            }
            case 0:{
                System.out.println("Ana Menuye Donuluyor...");
                break;
            }
        }
        return secim;
    }
	private static void mailArayuzu(Kullanici kullanici) {
		int secim = -1;
		do {
			System.out.println("### MAIL ARAYUZU ###");
			System.out.println("1- Mail Gonder");
			System.out.println("2- Gelen Kutusu");
			System.out.println("3- Giden Kutusu");
			System.out.println("0- Ust menuye don");
			System.out.print("Lutfen bir secim yapiniz : ");
			try {
				secim = scanner.nextInt();
			} catch (Exception e){
				System.out.println("Gecerli bir secim yapiniz.");
			} finally {
				scanner.nextLine();
			}
			secim = mailMenuFunctions(secim,kullanici);
		} while (secim != 0);
		
	}
	
	private static int mailMenuFunctions(int secim, Kullanici kullanici) {
		switch (secim){
			case 1:{
				Mail mail=yeniMail(kullanici);
				break;
			}
			case 2:{
				List<Mail> mailList=gelenMailler(kullanici);
				break;
			}
			case 3:{
				List<Mail> mailList=gidenMailler(kullanici);
				break;
			}
			case 0:{
				System.out.println("ust menuye donuluyor");
				break;
			}
		}
		return secim;
	}
	private static void smsArayuzu(Kullanici kullanici) {
		int secim = -1;
		do {
			System.out.println("### SMS ARAYUZU ###");
			System.out.println("1- SMS Gonder");
			System.out.println("2- Gelen Kutusu");
			System.out.println("3- Giden Kutusu");
			System.out.println("0- Ust menuye don");
			System.out.print("Lutfen bir secim yapiniz : ");
			try {
				secim = scanner.nextInt();
			} catch (Exception e){
				System.out.println("Gecerli bir secim yapiniz.");
			} finally {
				scanner.nextLine();
			}
			secim = smsMenuFunctions(secim,kullanici);
		} while (secim != 0);
		
	}
	
	private static int smsMenuFunctions(int secim, Kullanici kullanici) {
		switch (secim){
			case 1:{
				Sms sms=yeniSms(kullanici);
				break;
			}
			case 2:{
				List<Sms> smsList=gelenSmsler(kullanici);
				break;
			}
			case 3:{
				List<Sms> smsList=gidenSmsler(kullanici);
				break;
			}
			case 0:{
				System.out.println("ust menuye donuluyor");
				break;
			}
		}
		return secim;
	}
	
	private static List<Mail> gidenMailler(Kullanici kullanici) {
		List<Mail> mailList=mailDB.findSendByKullanici(kullanici);
		if (mailList.isEmpty()){
			System.out.println("Goruntulenecek hicbir mail bulunmamaktadir.");
			return null;
		}
		else {
			System.out.println(kullanici.getKullaniciAdi()+" kullanicisi tarafindan gonderillen mailler");
			mailList.forEach(System.out::println);
			return mailList;
		}
	}
	
	private static List<Mail> gelenMailler(Kullanici kullanici) {
		List<Mail> mailList=mailDB.findReceivedByKullanici(kullanici);
		if (mailList.isEmpty()){
			System.out.println("Goruntulenecek hicbir mail bulunmamaktadir.");
			return null;
		}
		else {
			System.out.println(kullanici.getKullaniciAdi()+" kullanicisina gelen mailler");
			mailList.forEach(System.out::println);
			return mailList;
		}
		
	}
	private static List<Sms> gelenSmsler(Kullanici kullanici) {
		List<Sms> smsList=smsDB.findReceivedByKullanici(kullanici);
		if (smsList.isEmpty()){
			System.out.println("Goruntulenecek hicbir sms bulunmamaktadir.");
			return null;
		}
		else {
			System.out.println(kullanici.getKullaniciAdi()+" kullanicisina gelen smsler");
			smsList.forEach(System.out::println);
			return smsList;
		}
	}
	private static List<Sms> gidenSmsler(Kullanici kullanici) {
		List<Sms> smsList=smsDB.findSendByKullanici(kullanici);
		if (smsList.isEmpty()){
			System.out.println("Goruntulenecek hicbir sms bulunmamaktadir.");
			return null;
		}
		else {
			System.out.println(kullanici.getKullaniciAdi()+" kullanicisi tarafindan gonderillen smsler");
			smsList.forEach(System.out::println);
			return smsList;
		}
	}
	
	private static Mail yeniMail(Kullanici kullanici) {
		Mail mail;
		System.out.println("### MAIL GONDERME ###");
		System.out.print("Lutfen mail gondermek istediginiz mail adresini giriniz");
		String aliciMail=scanner.nextLine();
		if (kullaniciDB.existsByEmail(aliciMail)){
			Kullanici aliciKullanici=kullaniciDB.findByEmail(aliciMail);
			if (aliciKullanici!=null){
				mail=new Mail();
				mail.setGonderici(kullanici);
				mail.setAlici(aliciKullanici);
				System.out.print("Lutfen mail basligini giriniz: ");
				mail.setBaslik(scanner.nextLine());
				System.out.print("Lutfen mail icerigini giriniz: ");
				mail.setIcerik(scanner.nextLine());
				mailDB.save(mail);
				System.out.println("Mail basariyla gonderildir");
//				mailDB.findAll().forEach(System.out::println);
			}else {
				System.out.println("Bir sorun ile karsilasildi.");
				return null;
			}
			return mail;
		}
		else {
			System.out.println("Girdiginiz mail adresi kullanilmamaktadir.");
			return null;
		}
	}
	private static Sms yeniSms(Kullanici kullanici) {
		Sms sms;
		System.out.println("### SMS GONDERME ###");
		System.out.print("Lutfen Sms gondermek istediginiz telefon numarasini giriniz");
		String aliciTelNo=scanner.nextLine();
		if (kullaniciDB.existsByTelNo(aliciTelNo)){
			Kullanici aliciKullanici=kullaniciDB.findByTelNo(aliciTelNo);
			if (aliciKullanici!=null){
				sms=new Sms();
				sms.setGonderici(kullanici);
				sms.setAlici(aliciKullanici);
				System.out.print("Lutfen sms icerigini giriniz: ");
				sms.setIcerik(scanner.nextLine());
				smsDB.save(sms);
				System.out.println("Sms basariyla gonderildi");
//				mailDB.findAll().forEach(System.out::println);
			}else {
				System.out.println("Bir sorun ile karsilasildi.");
				return null;
			}
			return sms;
		}
		else {
			System.out.println("Girdiginiz telefon numarasi kullanilmamaktadir.");
			return null;
		}
	}

	
    private static void telNoDegistir(Kullanici kullanici) {
        //TODO Potansiyel iptal islemleri icin case yapisi kurulabilir.
        System.out.println("### Telefon Numarasi Degistirme ###");
        kullanici.setTelNo(telNoAl());
        kullaniciDB.update(kullanici);
    }
    private static void emailDegistir(Kullanici kullanici) {
        //TODO Potansiyel iptal islemleri icin case yapisi kurulabilir.
        System.out.println("### Email Degistirme ###");
        kullanici.setEmail(emailAl());
        kullaniciDB.update(kullanici);
    }
    private static boolean sifreDegistir(Kullanici kullanici) {
        //TODO Potansiyel iptal islemleri icin case yapisi kurulabilir.
        boolean isPasswordChanged = false;
        System.out.println("### Sifre Degistirme ###");
        System.out.print("Lutfen eski sifrenizi giriniz : ");
        String eskiSifre = scanner.nextLine();
        if(kullanici.getSifre().equals(eskiSifre)){
            kullanici.setSifre(sifreAl());
            kullaniciDB.update(kullanici);
            isPasswordChanged = true;
        }else {
            System.out.println("Eski sifrenizi yanlis girdiniz !! ");
        }
        return isPasswordChanged;
    }

    private static Kullanici kullaniciyiGoruntule(int id) {
        Kullanici kullanici = kullaniciDB.findByID(id);
        if(kullanici != null){
            System.out.println(kullanici);
            return kullanici;
        } else {
            System.out.println("Beklenmedik bir hata ile karsilasildi... ");
            return null;
        }
    }

    private static List<Kullanici> kullanicilariGoruntule() {
        List<Kullanici> kullaniciList = kullaniciDB.findAll();
        if(kullaniciList.isEmpty()){
            System.out.println("Hic kullanici bulunamadi...\n");
        }else {
			kullaniciList.forEach(System.out::println);
        }
        return kullaniciList;
    }

    private static Kullanici sifremiUnuttum() {
        System.out.print("Lutfen TC Kimlik No giriniz : ");
        String tcKimlik = scanner.nextLine();
        System.out.print("Lutfen mail adresinizi giriniz : ");
        String email = scanner.nextLine();
        System.out.print("Lutfen telefon no giriniz : ");
        String telNo = scanner.nextLine();

        Kullanici kullanici = kullaniciDB.findByTcEmailPhoneNo(tcKimlik, email, telNo);

        if (kullanici != null) {
            kullanici.setSifre(sifreAl());
            if (kullaniciDB.update(kullanici) != null) {
                return kullanici;
            } else {
                System.out.println("Beklenmedik bir sorun ile karsilasildi.");
                return null;
            }
        } else {
            System.out.println("Girdiginiz bilgilerde eslesmeyen alanlar var. ");
            return null;
        }
    }

    private static Kullanici girisYap() {
        System.out.print("Lutfen kullanici adinizi giriniz : ");
        String username = scanner.nextLine();
        System.out.print("Lutfen sifrenizi giriniz : ");
        String password = scanner.nextLine();
        Kullanici kullanici = kullaniciDB.findByUsernameAndPassword(username, password);
        if (kullanici != null) {
            return kullanici;
        } else {
            System.out.println("Kullanici adi veya sifre hatali. ");
            return null;
        }
    }

    private static Kullanici kullaniciKaydi() {
        LocalDate dogumTarihi;
        Kullanici kullanici;
        dogumTarihi = dogumTarihiAl();
//       dogumTarihi = LocalDate.of(1996,8,7);
        if (dogumTarihKontrol(dogumTarihi)) {
            //Dogum tarihini kontrolunu gectik, o zaman kullanici olusturabiliriz.
            kullanici = new Kullanici();
            kullanici.setDogumTarihi(dogumTarihi);
            String[] isimSoyisim = isimSoyisimAl();
            kullanici.setIsim(isimSoyisim[0]);
            kullanici.setSoyisim(isimSoyisim[1]);
            kullanici.setEmail(emailAl());
            kullanici.setTelNo(telNoAl());
            kullanici.setTcKimlik(tcKimlikAl());
            kullanici.setKullaniciAdi(kullaniciAdiAl());
            kullanici.setSifre(sifreAl());
            kullaniciDB.save(kullanici);
            return kullanici;
        } else {
            System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
        }
        return null;
    }

    private static String kullaniciAdiAl() {

        String kullaniciAdi;
        while (true) {
            System.out.print("Lutfen bir kullanici adi giriniz min 4 - max 16 karakter : ");
            kullaniciAdi = scanner.nextLine();
            if (kullaniciAdi.length() < 4) {
                System.out.println("Kullanici adi 4 karakterden kisa olamaz.");
                continue;
            } else if (kullaniciAdi.length() > 16) {
                System.out.println("Kullanici adi 16 karakterden uzun olamaz.");
                continue;
            }
            if (!kullaniciDB.existsByUsername(kullaniciAdi)) {
                return kullaniciAdi;
            } else {
                System.out.println("Kullanici adi sistemde bulunmaktadir.");
            }
        }
    }

    private static String tcKimlikAl() {
        String tcKimlik;
        while (true) {
            System.out.print("Lutfen TC kimlik numaranizi giriniz : ");
            tcKimlik = scanner.nextLine();
            if (tcKimlik.length() != 11) {
                System.out.println("TC Kimlik No 11 haneli olmalidir.");
                continue;
            } else if (!numerikDegerKontrol(tcKimlik)) {
                System.out.println("TC Kimlik No sadece numerik karakterler barindirabilir. ");
                continue;
            }
            if (!kullaniciDB.existsByTcKimlik(tcKimlik)) {
                return tcKimlik;
            } else {
                System.out.println("TC kimlik sistemde bulunmaktadir.");
            }
        }
    }

    private static String emailAl() {
        while (true) {
            System.out.print("Lutfen mailinizi giriniz : ");
            String email = scanner.nextLine();
            if (!kullaniciDB.existsByEmail(email)) {
                return email;
            } else {
                System.out.println("Girdiginiz email kullanilmaktadir.");
            }
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

    private static String sifreAl() {
        String sifre;
        String sifreYeniden;
        while (true) {
            System.out.print("Lutfen bir sifre giriniz min 8 - max 32 karakter : ");
            sifre = scanner.nextLine();
            if (sifre.length() < 8) {
                System.out.println("Sifre 8 karakterden kisa olamaz.");
                continue;
            } else if (sifre.length() > 32) {
                System.out.println("Sifre 32 karakterden uzun olamaz.");
                continue;
            } else {
                System.out.print("Lutfen sifreninizi tekrar giriniz : ");
                sifreYeniden = scanner.nextLine();
                if (sifre.equals(sifreYeniden)) {
                    return sifre;
                } else {
                    System.out.println("Girdiginiz sifreler eslesmiyor! ");
                }
            }
        }

    }

    private static String telNoAl() {
        System.out.print("Lutfen telefon numaranizi giriniz : +90 ");
        String telNo = scanner.nextLine();
        return telNo;
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
            } catch (Exception e) {
                System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz!!!\n");
            }
        }
    }

    private static boolean dogumTarihKontrol(LocalDate date) {
        int yas = Period.between(date, LocalDate.now()).getYears();
        boolean resitMi = (yas < 18) ? false : true;
        return resitMi;
    }

    private static void generateData(){
    for (int i = 1; i<10; i++){
        Kullanici kullanici = new Kullanici();
            kullanici.setIsim("kullanici" +i);
            kullanici.setSoyisim("soyisim" +i);
            kullanici.setEmail(kullanici.getIsim()+ "@gmail.com");
            kullanici.setTelNo("123123121"+i);
            kullanici.setTcKimlik("1234567891"+i);
            kullanici.setKullaniciAdi(kullanici.getIsim());
            kullanici.setSifre("12345678");
            kullanici.setDogumTarihi(LocalDate.of((1990+i),i,i));
            kullaniciDB.save(kullanici);
    }
    }
}