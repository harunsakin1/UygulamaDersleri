package uygulamalar.kullanici_kayit_sistemi.refactored;

import uygulamalar.kullanici_kayit_sistemi.refactored.entities.*;

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