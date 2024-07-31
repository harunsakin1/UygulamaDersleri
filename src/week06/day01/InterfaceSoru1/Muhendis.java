package week06.day01.InterfaceSoru1;
/*
6- Muhendis Unvani; maasi 50000'den fazla ise uzman mühendis. 40000'den fazla ise kidemli muhendis, 30000'den fazla ise muhendis, 30000'den az ise stajyer muhendis olsun.
 */
public class Muhendis extends Calisan implements SahaCalismasiYapabilir, MaasaGoreUnvanAlabilir{
	//CalisanDB calisanDB=new CalisanDB();
	public Muhendis(String isim,String soyisim, double maas){
	this.isim=isim;
	this.setSoyisim(soyisim);
	this.setMaas(maas);
	setUnvan(maas);
	}
//	{
//		calisanDB.save(this);
//	}
	
	@Override
	public void sahaCalismasiYap() {
		System.out.println("Muhendis Saha Calismasi");
	}
	
	@Override
	public void maasAl() {
		System.out.println("Muhendis maas al metodu");
	}
	
	@Override
	public void izinAl() {
		System.out.println("Muhendis izin al metodu");
	}
	
	@Override
	public void fazlaMesaiYap() {
		System.out.println("Muhendis fazla mesai yap metodu");
	}
	
	@Override
	public void setUnvan(double maas) {
		if(maas >= 50000){
			this.setUnvan("Uzman Muhendis");
		} else if(maas>=40000){
			this.setUnvan("Kidemli Muhendis");
		} else if(maas >= 30000){
			this.setUnvan("Muhendis");
		} else {
			this.setUnvan("Stajyer Muhendis");
		}
	}
	
	@Override
	public void setMaas(double maas) {
		super.setMaas(maas);
		setUnvan(maas);
	}
	@Override
	public String toString() {
		return this.getClass().getSuperclass().getSimpleName()+"{"+"Muhendis{" +
				super.toStringTemplate()+'\'' +
				'}'+"}";
	}
}