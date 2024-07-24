package week04.kullanici_kayit_sistemi.refactored;

import java.time.LocalDate;

public class Sms extends Message {
	private static int smsCount=0;
	
	
	public Sms() {
		this.smsCount++;
		this.id =smsCount;
		this.gonderilmeTarihi = LocalDate.now();
		System.out.println("Sms gonderildi");
	}
	
	public static int getSmsCount() {
		return smsCount;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Sms{" + "smsID=" + getId()
				+ ", alici=" + getAlici()
				+ ", gonderici=" + getGonderici()
				+ ", icerik='" + getIcerik() + '\''
				+ ", gonderilmeTarihi=" + getGonderilmeTarihi() + '}';
	}
}