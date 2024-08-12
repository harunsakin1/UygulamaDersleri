package collectionFramework.set;

import java.util.*;

public class SetDeneme {
	public static void main(String[] args) {
		Set<Set<Integer>> setlerSeti=new HashSet<>();
		Set<Integer> set1=new HashSet<>(Set.of(2,3,4));
		Set<Integer> set2=new HashSet<>(Set.of(3,4,2));
		setlerSeti.add(set1);
		setlerSeti.add(set2);
		System.out.println(setlerSeti);
		
		Set<List<Integer>> listelerSeti=new HashSet<>();
		listelerSeti.add(List.of(10,20,30));
		System.out.println(listelerSeti);
		
		
		
	}
}