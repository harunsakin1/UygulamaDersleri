package week03.day03;

/*
3- int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
Yukar?daki 2 boyutlu array'i tek boyutlu bir array olarak yazd?ran metot.
 */
public class Question003 {
	public static void main(String[] args) {
		int[][] matris =
				{
						{56, 23, 678, 231, 5},
						{234, 21, 78, 26, 6},
						{654, 33, 32, 67, 2},
						{189, 35, 56, 89, 8}
				};
		dizideBoyutDusurme(matris);
	}
	
	public static void dizideBoyutDusurme(int matris[][]) {
		int[] tekBoyutluDizi = new int[matris.length * matris[0].length];
		int index = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				tekBoyutluDizi[index] = matris[i][j];
				index++;
			}
		}
		Question002.diziYazdir(tekBoyutluDizi);
	}
}