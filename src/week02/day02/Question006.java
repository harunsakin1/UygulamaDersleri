package week02.day02;


import java.util.Scanner;

public class Question006 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numaraKodu, mailKodu, numara = 1532, mail = 2351;
		System.out.println("Numara kodunuzu giriniz : ");
		numaraKodu = sc.nextInt();
		System.out.println("Mail kodunuzu giriniz : ");
		mailKodu = sc.nextInt();
		if (numaraKodu == numara && mailKodu == mail)
		{
			System.out.println("Basariyla giris yaptiniz.");
		}
		else if (numaraKodu == numara && mailKodu != mail)
		{
			System.out.println("Mail kodunuz hatali!");
		}
		else if (numaraKodu != numara && mailKodu == mail)
		{
			System.out.println("Numara kodunuz hatali!");
		}
		else System.out.println("Her iki kodunuz da hatali!");
		
	}
}