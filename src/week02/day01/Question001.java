package week02.day01;

public class Question001 {
	public static void main(String[] args) {
		float urunFiyat = 100, hamFiyat, kdv = 0.18f, kdvsizFiyat, kar = 0.15f;
		
		kdvsizFiyat = urunFiyat - (urunFiyat * kdv);
		hamFiyat = kdvsizFiyat - (kdvsizFiyat * kar);
		System.out.println("Ham Fiyat : " + hamFiyat);
		
	}
}