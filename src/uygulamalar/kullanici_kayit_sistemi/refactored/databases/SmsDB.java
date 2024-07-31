package uygulamalar.kullanici_kayit_sistemi.refactored.databases;

import uygulamalar.kullanici_kayit_sistemi.refactored.entities.Sms;
import uygulamalar.kullanici_kayit_sistemi.refactored.utility.DatabaseManager;
import uygulamalar.kullanici_kayit_sistemi.refactored.entities.Kullanici;

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