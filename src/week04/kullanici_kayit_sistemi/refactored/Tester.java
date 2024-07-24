package week04.kullanici_kayit_sistemi.refactored;

public class Tester {
	public static void main(String[] args) {
		
		Mail mail=new Mail();
		Mail mail2=new Mail();
		Mail mail3=new Mail();
		
		MailOzelListe mailOzelListe=new MailOzelListe();
		Mail[] mailList={mail,mail2,mail3};
		mailOzelListe.addAll(mailList);
		mailOzelListe.list();
		
		Kullanici kullanici1=new Kullanici();
		Kullanici kullanici2=new Kullanici();
		Kullanici kullanici3=new Kullanici();
		
		KullaniciOzelListe kullaniciOzelListe=new KullaniciOzelListe();
		kullaniciOzelListe.add(kullanici1);
		kullaniciOzelListe.add(kullanici2);
		kullaniciOzelListe.add(kullanici3);
		kullaniciOzelListe.list();
		
		Sms sms1=new Sms();
		Sms sms2=new Sms();
		Sms sms3=new Sms();
		SmsOzelListe smsOzelListe=new SmsOzelListe();
		
		smsOzelListe.add(sms1);
		smsOzelListe.add(sms2);
		smsOzelListe.add(sms3);
		smsOzelListe.list();
		
		
		
		
		
	}
}