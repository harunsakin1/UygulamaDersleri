package uygulamalar.grupProje_1.kullaniciIslemleri.entities;

import java.time.LocalDate;

public class Sms extends Message {
	private static int smsCount=0;
	
	
	public Sms() {
		this.smsCount++;
		this.id =smsCount;
		this.gonderilmeTarihi = LocalDate.now();
	}
	
	public static int getSmsCount() {
		return smsCount;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Sms{ " +
				"\ngonderen : "+gonderici.getTelNo()+
				"\nalici : "+alici.getTelNo()+
				"\nicerik : "+icerik+"\n}";
	}
}