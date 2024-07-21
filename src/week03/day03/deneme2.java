package week03.day03;

import java.util.Scanner;

public class deneme2 {
	public static void main(String[] args) {
//		String str="Harun SAKIN";
//		System.out.println(str.split("\\s+").length);
//		StringBuilder sb=new StringBuilder();
//		sb.append("Bu bir ornek metindir");
//		sb.insert(3,"Harun");
//		sb.replace(3,5,"sasa");
//		String sub=sb.substring(0,6);
//		sb.delete(0,10);
//		sb.deleteCharAt(sb.length()-1);
//		System.out.println(sb);
//		System.out.println(sub);
		
		menu();
	}
	public static void menu(){
		Scanner sc=new Scanner(System.in);
		
		boolean ilkMenuKontrol=true;
		while (ilkMenuKontrol){
			System.out.println("secim : ");
			int ilkSecim=sc.nextInt();
			boolean icMenuKontrol=true;
			switch (ilkSecim){
				case 1:{
					System.out.println("dis menu 1");
					
					do {
						System.out.println("2. secim : ");
						int ikinciSecim=sc.nextInt();
						System.out.println("ic menu");
						switch (ikinciSecim){
							case 1: {
								System.out.println("ic menu 1");
								break;
							}
							case 2:{
								System.out.println("ic menu 2");
								break;
							}
							case 3:{
								System.out.println("ana ekrana donuluyor");
								icMenuKontrol=false;
								break;
							}
						}
						
					}while (icMenuKontrol);
					break;
					
				}
				case 2:{
					System.out.println("dis menu 2");
					do {
						System.out.println("2. secim : ");
						int ikinciSecim=sc.nextInt();
						System.out.println("ic menu");
						switch (ikinciSecim){
							case 1: {
								System.out.println("2.secim ic menu 1");
								break;
							}
							case 2:{
								System.out.println("2.secim ic menu 2");
								break;
							}
							case 3:{
								System.out.println("ana ekrana donuluyor");
								icMenuKontrol=false;
								break;
							}
						}
						
					}while (icMenuKontrol);
					break;
				}
				case 3:{
					System.exit(1);
				}
				default:{
					System.out.println("lutfen gecerli secim yap");
				}
			}
		}
	}
}