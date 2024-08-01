package uygulamalar.grupProje_1.entities;
/*
Bir sepet uygulaması yapacağız. Urunlerimiz olacak. Bu ürünlerden seçim yapıp, adet seçip ürünleri sepetimize ekleyeceğiz. Sepetin bütününü görüntülediğimizde ürün x adet fiyatları ve en altta toplam sepet tutarı görüntülenebilecek. Veri saklamak için list yapılarını kullanabiliriz. Bunun dışında serbest geliştirmeye açık. Ekstra bir şeyler istenmesi durumunda ben buradan belirteceğim.
 */
import uygulamalar.grupProje_1.utilities.enums.EKategori;

import java.util.ArrayList;


public class Urun {
	private static Integer idCount=0;
	private String ad;
	private Double fiyat;
	private Integer urunId;
	private String aciklama;
	private EKategori kategori;
	private Integer adet;
	
	public static ArrayList<Urun> urunArrayList=new ArrayList<>();
	
	public Urun(String ad, Double fiyat, String aciklama, EKategori kategori,Integer adet) {
		this.urunId=++idCount;
		this.ad = ad;
		this.fiyat = fiyat;
		this.aciklama = aciklama;
		this.kategori = kategori;
		this.adet=adet;
		urunArrayList.add(this);
	}
	
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public Integer getUrunId() {
		return urunId;
	}
	
	public String getAciklama() {
		return aciklama;
	}
	
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	public EKategori getKategori() {
		return kategori;
	}
	
	public void setKategori(EKategori kategori) {
		this.kategori = kategori;
	}
	
	public Integer getAdet() {
		return adet;
	}
	
	public void setAdet(Integer adet) {
		this.adet = adet;
	}
	
	public String urunOzetBilgisi(){
		return " id : "+getUrunId()+ '\''
				+ ", ad : " + getAd()
				+", adet : "+getAdet()
				+ ", fiyat : '" + getFiyat() + '\'';
	}
	
	public String urunDetayBilgisi(){
		return "  id : "+getUrunId()+ '\''+
		         "kategori : "+getKategori()+ '\''
				 +", ad : " + getAd()
				 + ", fiyat : '" + getFiyat() + '\''
				 + ", adet : '" + getAdet() + '\''
				 + ", aciklama : " + getAciklama();
	}
}