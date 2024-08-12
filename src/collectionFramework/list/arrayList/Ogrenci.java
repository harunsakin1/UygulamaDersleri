package collectionFramework.list.arrayList;

public class Ogrenci implements Comparable {
	private String ad;
	private String soyad;
	private Integer ogrNo;
	
	public Ogrenci(String ad, String soyad, Integer ogrNo) {
		this.ad = ad;
		this.soyad = soyad;
		this.ogrNo = ogrNo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public Integer getOgrNo() {
		return ogrNo;
	}
	
	public void setOgrNo(Integer ogrNo) {
		this.ogrNo = ogrNo;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' + ", ogrNo='" + getOgrNo() + '\'' + '}';
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}