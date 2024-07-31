package week06.day01.InterfaceSoru1;

public class Tekniker extends Calisan implements SahaCalismasiYapabilir{
	//CalisanDB calisanDB=new CalisanDB();
//	{
//		calisanDB.save(this);
//	}
	@Override
	public void sahaCalismasiYap() {
		System.out.println(this.getClass().getSimpleName()+" saha calismasi");
	}
	@Override
	public void maasAl() {
		System.out.println("Tekniker maas al metodu");
	}
	
	@Override
	public void izinAl() {
		System.out.println("Tekniker izin al metodu");
	}
	
	@Override
	public void fazlaMesaiYap() {
		System.out.println("Tekniker fazla mesai yap metodu");
	}
	@Override
	public String toString() {
		return this.getClass().getSuperclass().getSimpleName()+"{"+"Tekniker{" +
				super.toStringTemplate()+'\'' +
				'}'+"}";
	}
}