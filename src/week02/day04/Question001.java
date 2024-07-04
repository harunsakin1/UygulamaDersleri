package week02.day04;
import java.util.Scanner;

/*
1- Disaridan bir string girdisi alalim. Bu stringin her bir harfini,
bulundugu index ile birlikte alt alta yazdiracagim.
*/
public class Question001 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir kelime giriniz : ");
		String kelime=sc.nextLine();
		
		for (int i=0;i<=kelime.length()-1;i++){
			System.out.println(i+". index --->"+kelime.charAt(i));
		}
		
	}
}