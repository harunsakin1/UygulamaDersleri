package collectionFramework.sorular._09_08_2024_Sorular;

import java.util.Scanner;
import java.util.Stack;

/*
2- Disaridan bir metin girelim. Girdigimiz metni bir stack'e bir metot araciligiyla atayalim.
Stack<> stack = new Stack();
ihtiyacimiz olacak stack metotlari;
.pop
.push
metotlarin nasil kullanildigini dokumantasyon araciligiyla ogrenebilirsiniz.
sonra girilen kelimenin palindrom kontrolu icin isPalindrome metoduna kelimeyi gonderelim ve stack kullanarak palindrom kontrolümüzü gerceklestirelim.
 */
public class Soru2 {
	static Scanner scanner = new Scanner(System.in);
	static Stack<Character> characterStack =  new Stack<>();
	public static void main(String[] args) {
		isPalindrome();
//        String kelime = "KULLUK";
//        kelimeyiStackeYerlestir(kelime);
//        kelimeyiCharCharYazdir(kelime);
//        System.out.println("\n#####\n");
//        System.out.println(characterStack);
//        stackErit();
	}
	
	
	private static String stringKelimeAl(){
		System.out.print("Lutfen bir kelime giriniz : ");
		return scanner.nextLine();
	}
	
	private static String kelimeyiStackeYerlestir(String kelime){
		for (int i = 0; i<kelime.length();i++){
			//alperen -> alperen -> LIFO -> nerepla
			characterStack.push(kelime.charAt(i));
		}
		return kelime;
	}
//	private static void kelimeyiCharCharYazdir(String kelime){
//		for (int i = 0; i<kelime.length();i++){
//			System.out.println(kelime.charAt(i));
//		}
//	}
	
//	private static void stackErit(){
//		while (!characterStack.isEmpty()){
//			System.out.println(characterStack.pop());
//		}
//	}
	
	private static boolean isPalindrome(){
		String kelime =  kelimeyiStackeYerlestir(stringKelimeAl());
		for (int i =0; i<(kelime.length()/2);i++) {
			if (kelime.charAt(i) != characterStack.pop()) {
				System.out.println("Kelime Palindrom Degildir!!!");
				return false;
			}
		}
		System.out.println("Kelime Palindromdur!!!");
		return true;
	}
}