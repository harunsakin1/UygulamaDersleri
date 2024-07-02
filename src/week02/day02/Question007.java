package week02.day02;


import java.util.Scanner;

public class Question007 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			boolean kontrol = true;
			System.out.print("Bir sayi giriniz : ");
			double sayi = sc.nextDouble();
//		while (sayi%5==0){
//			sayi/=5;
//			if (sayi==1){
//				System.out.println("Sayi 5'in kuvvetidir.");
//			}
//			else System.out.println("Sayi 5'in kuvveti degildir");
//		}
			if (sayi % 5 == 0) {
				while (sayi % 5 == 0) {
					sayi /= 5;
				}
				if (sayi == 1) {
					System.out.println("Sayi 5'in kuvvetidir.");
				}
				else System.out.println("Sayi 5'in kuvveti degildir");
			}
	}
}