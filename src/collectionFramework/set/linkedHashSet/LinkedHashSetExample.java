package collectionFramework.set.linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<Integer>sayiHashSset=new HashSet<>();
		
		sayiHashSset.addAll(Set.of(1,-10,20,-30,3,-13,100));
		System.out.println("HashSet : "+sayiHashSset);
		
		
		System.out.println("Set.of ile ekleme yaparsak, set kendi i�inde s�ral� veri saklamay� ama�lamad��� i�in, veriler daha eklerken kar���k s�raya b�r�n�r.");
		LinkedHashSet<Integer>sayiLinkedHashSetWithSetOf=new LinkedHashSet<>();
		sayiLinkedHashSetWithSetOf.addAll(Set.of(1, -10, 20, -30, 3, -13, 100));
		System.out.println("sayiLinkedHashSetWithSetOf : "+sayiLinkedHashSetWithSetOf);
		
		
		LinkedHashSet<Integer>sayiLinkedHashWithListOf=new LinkedHashSet<>();
		sayiLinkedHashWithListOf.addAll(List.of(1, -10, 20, -30, 3, -13, 100));
		System.out.println("sayiLinkedHashWithListOf : "+sayiLinkedHashWithListOf);
		
		
	}
}