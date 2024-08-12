package collectionFramework.list.linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String>nameDeque=new LinkedList<>();
		System.out.println(nameDeque);
		System.out.println("\n.add ile normal ekleme yapýlýr.");
		nameDeque.add("Alperen");
		System.out.println(nameDeque);
		System.out.println("\n.addFirst ile ilk indexe ekleme yapýlýr.");
		nameDeque.addFirst("Alex");
		System.out.println(nameDeque);
		System.out.println("\n.addLast ile son indexe ekleme yapýlýr.");
		nameDeque.addLast("Emine");
		System.out.println(nameDeque);
		
		nameDeque.add("Harun");
		nameDeque.add("Mehmet");
		nameDeque.add("Selin");
		nameDeque.add("Mehmet Can");
	}
}