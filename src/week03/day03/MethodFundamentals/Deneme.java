package week03.day03.MethodFundamentals;

public class Deneme {
	public static void main(String[] args) {
		Deneme obj=new Deneme();
		System.out.println(obj.f(10));
		System.out.println(g(5,16));
		int sayi1=15,sayi2=55;
		Sayilar obj2=sayiTopla(sayi1,sayi2);
		System.out.println(obj2.toString());
	}
	int f(int x){
		return 5*x+10;
	}
	static double  g(int x,int y){
		return (x*x)+Math.sqrt(y);
	}
	public static Sayilar sayiTopla(int sayi1,int sayi2){
		Sayilar obj=new Sayilar();
		obj.sayi2=30;
		obj.sayi1=44;
		obj.sayi2=16;
		obj.sayi1=34;
		Sayilar obj2=new Sayilar();
		obj2.sayi1=33;
		//int topla=obj.sayi2+obj.sayi1;
		System.out.println(obj2.sayi1+ obj.sayi1);
		return obj;
		
	}
}