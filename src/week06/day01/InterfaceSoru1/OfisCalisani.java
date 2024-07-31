package week06.day01.InterfaceSoru1;

public class OfisCalisani extends Calisan implements MaasaGoreUnvanAlabilir{
	//CalisanDB calisanDB=new CalisanDB();
	public OfisCalisani(String isim,String soyisim, double maas){
		this.isim=isim;
		this.setSoyisim(soyisim);
		this.setMaas(maas);
		setUnvan(maas);
	}
//	{
//		calisanDB.save(this);
//	}
	
	@Override
	public void setUnvan(String unvan) {
		super.setUnvan(unvan);
	}
	
	@Override
	public void maasAl() {
		System.out.println("Ofis Calisani maas al metodu");
	}
	
	@Override
	public void izinAl() {
		System.out.println("Ofis Calisani izin al metodu");
	}
	
	@Override
	public void fazlaMesaiYap() {
		System.out.println("Ofis Calisani fazla mesai yap metodu");
	}
	
	@Override
	public void setMaas(double maas) {
		super.setMaas(maas);
		setUnvan(maas);
	}
	
	@Override
	public void setUnvan(double maas) {
		if (maas >= 30000) {
			setUnvan("Kidemli Calisan");
		}
		else if (maas >= 20000) {
			setUnvan("Calisan");
		}
		else {
			setUnvan("Stajyer");
		}
		
	}
	@Override
	public String toString() {
		return this.getClass().getSuperclass().getSimpleName()+"{"+"OfisCalisani{" +
				super.toStringTemplate()+'\'' +
				'}'+"}";
	}
}