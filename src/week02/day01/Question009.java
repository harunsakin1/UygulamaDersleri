package week02.day01;

public class Question009 {
	public static void main(String[] args) {
		int toplam=0,sayac=0,a=1;
		for (int i=1;toplam<=50;i++){
			sayac++;
			toplam=toplam+i;
		}
//		while (toplam<=50){
//			sayac++;
//			toplam=toplam+a;
//			a++;
//		}
		System.out.println("Toplam : "+toplam+"    "+sayac+" . adimda bitti");
	}
}