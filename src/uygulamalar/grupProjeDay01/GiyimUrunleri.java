package uygulamalar.grupProjeDay01;

public class GiyimUrunleri extends Urun{
	private EBeden beden;
	private ERenk renk;
	
	public GiyimUrunleri(String ad, Double fiyat, String aciklama, EKategori kategori, Integer adet, EBeden beden, ERenk renk) {
		super(ad, fiyat, aciklama, kategori, adet);
		this.beden = beden;
		this.renk = renk;
	}
	
	public EBeden getBeden() {
		return beden;
	}
	
	public void setBeden(EBeden beden) {
		this.beden = beden;
	}
	
	public ERenk getRenk() {
		return renk;
	}
	
	public void setRenk(ERenk renk) {
		this.renk = renk;
	}
	
	@Override
	public String toString() {
		return super.urunOzetBilgisi();
	}
	
	@Override
	public String urunDetayBilgisi() {
		return super.urunDetayBilgisi()+" renk : "+getRenk()+" beden : "+getBeden();
	}
}