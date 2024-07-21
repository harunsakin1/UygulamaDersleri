package week04.day03;



public class Runner {
	public static void main(String[] args) {
		OzelListe obj=new OzelListe();
		
//		obj.add(6);
//		obj.add(11);
//		for (int sayi: obj.getSayiDizisi()){
//			System.out.println(sayi);
//		}
//		obj.list();
//		System.out.println();
//
//		obj.remove(0);
//		for (int sayi: obj.getSayiDizisi()){
//			System.out.println(sayi);
//		}
		obj.add(100);
		int[]sayilar={3,5,6,7,8};
		obj.addAll(sayilar);
		obj.list();
		int[]indexesToBeRemoved={0,2,4};
		obj.removeAll(indexesToBeRemoved);
		obj.list();
		
		
		
	}
}