package week03.day02;

/*
9- 2 Boyutlu Array'de çarp?m tablosunu yazd?ral?m.
 */
public class Question009 {
	public static void main(String[] args) {
		int[][] carpimTablosu = new int[10][10];
		for (int i = 0; i < carpimTablosu.length; i++) {
			for (int j = 0; j < carpimTablosu[i].length; j++) {
				carpimTablosu[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < carpimTablosu.length; i++) {
			for (int j = 0; j < carpimTablosu[i].length; j++) {
				System.out.print((j + 1) + " x " + (i + 1) + " : " + carpimTablosu[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}