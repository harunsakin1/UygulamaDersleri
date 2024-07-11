package week03.day04;

import java.util.Arrays;

/*
4- Dizideki elemanlar arasýndaki farkýn en küçük olduðu deðer nedir?
int[] array = { 1, 5, -4, 3 };
 */
public class Question004 {
	public static void main(String[] args) {
		int[] array = {1, 5, -4, 3};
		System.out.println(enKucukFarkBul(array));
	}
	public static int enKucukFarkBul(int[] array) {
//		Arrays.sort(array); // -4 1 2 5
//		int min = Integer.MAX_VALUE;
//		for (int i = 1; i < array.length; i++) {
//			int fark = array[i] - array[i - 1];
//			if (fark < min) min = fark;
//		}
//		return min;
		int minFark=Integer.MAX_VALUE;
		int fark;
		for (int i = 0; i <array.length ; i++) {
			for (int j = i+1; j <array.length ; j++) {
				fark=Math.abs(array[i]-array[j]);
				if (fark<minFark){
					minFark=fark;
				}
			}
		}
		return minFark;
	}
}