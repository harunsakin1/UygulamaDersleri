package week03.day05;

import java.util.Arrays;

public class Question002 {
	public static void main(String[] args) {
		String[] renk = {"Maca", "Kupa", "Karo", "Sinek"};
		String[] sayi = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		System.out.println("BUTUN DESTE");
		desteOlustur(sayi, renk);
		System.out.println("PAPAZ KACTI DESTESI");
		papazKacti(desteOlustur(sayi,renk));
		System.out.println("ALTMIS ALTI DESTESI");
		altmisAlti(desteOlustur(sayi,renk));
	}
	public static String[] desteOlustur(String[] renk, String[] sayi) {
		String[] deste = new String[renk.length * sayi.length];
		int index = 0;
		for (String s : sayi) {
			for (String r : renk) {
				deste[index] = s + " " + r;
				index++;
			}
		}
		for (String kart : deste) {
			System.out.println(kart);
		}
		return deste;
	}
	public static String[] papazKacti(String[] deste){
		String[]papazKacti=new String[deste.length-3];
		for (int i = 0,j=0; i < deste.length ; i++) {
			if (!(deste[i].equalsIgnoreCase("Karo K")||deste[i].equalsIgnoreCase("Sinek K")||deste[i].equalsIgnoreCase("Kupa K"))){
				papazKacti[j++]=deste[i];
			}
		}
//		for (String kart : papazKacti) {
//			System.out.println(kart);
//		}
		return papazKacti;
	}
	public static String[] altmisAlti(String[]deste){
		String []altmisAlti=new String[24];
		for (int i = 0,j=0; i < deste.length ; i++) {
			if (deste[i].contains(" 9")||deste[i].contains(" 10")||deste[i].contains(" A")||deste[i].contains(" Q")||deste[i].contains(" K")||deste[i].contains(" J")){
				altmisAlti[j++]=deste[i];
			}
		}
//		for (String kart : altmisAlti) {
//			System.out.println(kart);
//		}
		return altmisAlti;
		
	}
}