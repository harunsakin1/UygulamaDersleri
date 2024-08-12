package collectionFramework.list.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> nameQueue = new LinkedList<>();
		nameQueue.add("Alperen");
		nameQueue.add("Alex");
		nameQueue.add("Emine");
		nameQueue.add("Harun");
		nameQueue.add("Mehmet");
		nameQueue.add("Selin");
		nameQueue.add("Mehmet Can");
		nameQueue.forEach(System.out::println);
		
		System.out.println("\nEn bastaki elemana erisme. peek(): ");
		System.out.println(nameQueue.peek());
		System.out.println("Yeni Sira : ");
		nameQueue.forEach(System.out::println);
		
		System.out.println("\nEn bastaki elemana erisme ve sýradan çýkarma. poll(): ");
		System.out.println("cikarilan eleman : "+nameQueue.poll());
		System.out.println("Yeni Sira : ");
		nameQueue.forEach(System.out::println);
		
		
		System.out.println("cikarilan eleman : "+nameQueue.poll());
		System.out.println("Yeni Sira : ");
		nameQueue.forEach(System.out::println);
	}
}