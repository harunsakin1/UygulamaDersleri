package collectionFramework.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<Integer>sayiTreeSet=new TreeSet<>();
		sayiTreeSet.addAll(Set.of(1,-10,20,30,3,-13,100,60,-6));
		System.out.println("TreeSet : "+sayiTreeSet);
	}
}