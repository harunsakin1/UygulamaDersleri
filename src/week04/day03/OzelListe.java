package week04.day03;

import java.util.Arrays;

public class OzelListe {
	private int[]sayiDizisi;
	private int boyut;
	
	public int[] getSayiDizisi() {
		return sayiDizisi;
	}
	
	public void add(int sayi){
		int [] temp;
		if (sayiDizisi==null){
			sayiDizisi=new int[1];
			sayiDizisi[0]=sayi;
			this.boyut=1;
		}else {
			temp=new int[this.boyut+1]; // sayi dizimizin onceki size inin 1 fazlasi olacak cunku yeni bir eleman ekliyoruz.
			for (int i = 0; i <boyut ; i++) {
				temp[i]=sayiDizisi[i];
			}
			temp[this.boyut]=sayi;
			sayiDizisi=temp;
			this.boyut++;
		}
	}
	public void remove(int index){
		int[]temp=new int[this.boyut-1];
		for (int i = 0; i < this.boyut-1; i++) {
			if (i<index){
				temp[i]=sayiDizisi[i];
				
			}
			else {
			temp[i]=sayiDizisi[i+1];
			}
		}
		sayiDizisi=temp;
		this.boyut--;
		
	}
	public void list(){
		System.out.print("{");
		for (int i = 0; i < boyut; i++) {
			System.out.print(sayiDizisi[i]);
			if(i!=boyut-1){
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	
	public  void addAll(int[]sayiDizisi){
		for (int i = 0; i < sayiDizisi.length; i++) {
			add(sayiDizisi[i]);
		}
	}
	
	public void removeAll(int[]indexesToBeRemoved){
		Arrays.sort(indexesToBeRemoved);
		for (int i = indexesToBeRemoved.length-1;i>0 ; i--) {
			remove(indexesToBeRemoved[i]);
		}
	}

}