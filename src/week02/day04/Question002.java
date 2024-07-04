package week02.day04;
import java.util.Scanner;

/*
2- Disaridan bir deger alacagiz.
Bu degerin içerisinde kaç tane a harfi oldugunu yazdiracagiz
*/
public class Question002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir kelime giriniz : ");
		String kelime=sc.nextLine();
		char arananHarf='a';
		int sayac=0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i)==arananHarf){
				sayac++;
			}
		}
		System.out.println(sayac);
		
	}
}