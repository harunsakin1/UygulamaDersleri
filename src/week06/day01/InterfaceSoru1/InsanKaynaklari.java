package week06.day01.InterfaceSoru1;

public class InsanKaynaklari extends Calisan implements Sozlesmesizler{
	//CalisanDB calisanDB=new CalisanDB();
//	{
//		calisanDB.save(this);
//	}
	
	public double zamYap(Calisan calisan, double zamOrani){
		double zamliMaas=0;
		if (zamOrani<=1){
		zamliMaas= calisan.getMaas()+ calisan.getMaas()*zamOrani;
		}
		if (zamOrani>=1){
			zamliMaas= calisan.getMaas()*zamOrani;
		}
		if (calisan instanceof Muhendis){
		zamliMaas+=1000;
		}
		else if (calisan instanceof Tekniker) {
		zamliMaas+=500;
		}
		calisan.setMaas(zamliMaas);
		return zamliMaas;
	}
	public void unvanBelirle(){
		System.out.println("Unvan belirle metodu.");
	}
	@Override
	public void maasAl() {
		System.out.println("Insan kaynaklari maas al metodu");
	}
	
	@Override
	public void izinAl() {
		System.out.println("Insan kaynaklari izin al metodu");
	}
	
	@Override
	public void fazlaMesaiYap() {
		System.out.println("Insan kaynaklari fazla mesai yap metodu");
	}
	@Override
	public String toString() {
		return this.getClass().getSuperclass().getSimpleName()+"{"+"InsanKaynaklari{" +
				super.toStringTemplate()+'\'' +
				'}'+"}";
	}
	
}