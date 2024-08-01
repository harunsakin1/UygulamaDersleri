package uygulamalar.grupProje_1.kullaniciIslemleri.databases;

import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Kullanici;
import uygulamalar.grupProje_1.kullaniciIslemleri.entities.Sms;
import uygulamalar.grupProje_1.kullaniciIslemleri.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class SmsDB extends DatabaseManager<Sms> {
	public List<Sms> findReceivedByKullanici(Kullanici kullanici) {
		List<Sms> telNoByKullanici=new ArrayList<>();
		for (Sms sms:veriListesi){
			if (sms.getAlici().equals(kullanici)){
				telNoByKullanici.add(sms);
			}
		}
		return telNoByKullanici;
	}
	
	public List<Sms> findSendByKullanici(Kullanici kullanici) {
		List<Sms> telNoByKullanici=new ArrayList<>();
		for (Sms sms:veriListesi){
			if (sms.getGonderici().equals(kullanici)){
				telNoByKullanici.add(sms);
			}
		}
		return telNoByKullanici;
	}
}