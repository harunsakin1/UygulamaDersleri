package uygulamalar.grupProje_1.kullaniciIslemleri;

import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Kullanici;
import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Mail;

public class Tester {
	public static void main(String[] args) {
		
		Mail mail=new Mail();
		mail.setAlici(new Kullanici());
		mail.setGonderici(new Kullanici());
		mail.setBaslik("baslik");
		mail.setIcerik("icerik");
		System.out.println(mail);
		
		
		
		
		
	}
}