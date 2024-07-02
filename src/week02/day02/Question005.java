package week02.day02;

public class Question005 {
	public static void main(String[] args) {
		double tekToplam=0,ciftToplam=0;
//		for (int i=0;i<=100;i+=2){
//			ciftToplam+=i;
//		}
//		for (int i=1;i<100;i+=2){
//			tekToplam+=i;
//		}
		for (int i=1;i<=100;i++){
			if (i%2==0){
				ciftToplam+=i;
			}
			else {
				tekToplam+=i;
			}
		}
		System.out.println("Tek Toplam = "+tekToplam+"\nCift Toplam = "+ciftToplam);
		System.out.println("Cift sayilarin toplaminin tek sayilarin toplamina orani : "+(double)(ciftToplam/tekToplam));
	}
}