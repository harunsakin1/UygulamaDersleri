package uygulamalar.grupProje_1.kullaniciIslemleri.databases;


import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Kullanici;
import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Mail;
import uygulamalar.grupProje_1.kullaniciIslemleri.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;


public class MailDB extends DatabaseManager<Mail> {
	
	
	public List<Mail> findReceivedByKullanici(Kullanici kullanici) {
		List<Mail> mailsByKullanici=new ArrayList<>();
		for (Mail mail:veriListesi){
			if (mail.getAlici().equals(kullanici)){
				mailsByKullanici.add(mail);
			}
		}
		return mailsByKullanici;
	}
	
	public List<Mail> findSendByKullanici(Kullanici kullanici) {
		List<Mail> mailsByKullanici=new ArrayList<>();
		for (Mail mail:veriListesi){
			if (mail.getGonderici().equals(kullanici)){
				mailsByKullanici.add(mail);
			}
		}
		return mailsByKullanici;
	}
}