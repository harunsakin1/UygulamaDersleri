package week02.day01;

public class Question009 {
	public static void main(String[] args) {
		int toplam=0,sayac=0;
		for (int i=0;toplam<=50;i++){
			sayac++;
			toplam=toplam+i;
		}
		System.out.println("Toplam : "+toplam+"    "+sayac+" . adimda bitti");
	}
}