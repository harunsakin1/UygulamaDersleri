package week02.day01;

import java.util.Scanner;

public class Question005 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double alan, cevre, yariCap;
		System.out.println("Yaricap giriniz : ");
		yariCap=sc.nextDouble();
		alan=Math.PI*(yariCap*yariCap);
		cevre=2*Math.PI*yariCap;
		System.out.println("Dairenin Alan? : "+alan);
		System.out.println("Dairenin Cevresi : "+cevre);
		sc.close();
	}
}