package collectionFramework.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	
	public static void main(String[] args) {
		Set<Integer>sayilar=new HashSet<>();
		for (int i = 1; i <= 10; i++) {
			sayilar.add(i);
		}
		
		
		Iterator<Integer>iterator=sayilar.iterator();
		while (iterator.hasNext()){
			iterator.next();
			iterator.remove();
			
			
		}
		sayilar.removeIf(sayi -> sayi % 2 == 0);
		System.out.println(sayilar);
	}
}