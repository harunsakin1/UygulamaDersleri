package week06.day01.enumornekler.enumornek2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	static Scanner sc=new Scanner(System.in);
	static List<User> userDB=new ArrayList<>();
	public static void main(String[] args) {
		
		User user=new User();
		user.setUsername("Harun");
		user.setPassword("12345678");
		user.setRole(ERole.ADMIN);
		userDB.add(user);
		
		User user2=new User();
		user2.setUsername("Ali");
		user2.setPassword("12345678");
		user2.setRole(ERole.USER);
		userDB.add(user2);
		
		User user3=new User();
		user3.setUsername("Mehmet");
		user3.setPassword("12345678");
		user3.setRole(ERole.USER);
		userDB.add(user3);
		
		welcomeInterface();
	}
	public static void welcomeInterface(){
		int secim=-1;
		do {
			System.out.println("1- Giris yap");
			System.out.println("0- Cikis yap");
			System.out.print("Seciminiz : ");
			secim=sc.nextInt();
			sc.nextLine();
			welcomeFunctions(secim);
		}while (secim!=0);
	}
	
	private static void welcomeFunctions(int secim) {
		switch (secim){
			case 1:{
				User user=girisYap();
				break;
			}
			case 0:{
				System.out.println("Gule Gule");
				break;
			}
			default:
				System.out.println("Lutfen gecerli bir secim yapiniz.");
				break;
		}
	}
	
	private static User girisYap() {
		System.out.print("Username :");
		String username=sc.nextLine();
		System.out.print("Password : ");
		String password=sc.nextLine();
		User user;
		
		if (checkCredentials(username,password)){
			user=findByUsernameAndPassword(username,password);
			if (user!=null){
				if (user.getRole().equals(ERole.USER)){
					userMenu(user);
				}
				else if(user.getRole().equals(ERole.ADMIN)){
					adminMenu(user);
				}
			}
		}
		return null;
	}
	
	private static void adminMenu(User user) {
		int secim=-1;
		do {
			System.out.println("##### ADMIN MENU #####");
			System.out.println("1- Sifre degistir");
			System.out.println("2- Kullanici engelle");
			System.out.println("0- Cikis yap");
			System.out.print("Seciminiz : ");
			secim=sc.nextInt();
			sc.nextLine();
			adminFunctions(secim);
		}while (secim!=0);
	}
	
	private static void adminFunctions(int secim) {
		switch (secim){
			case 1:{
				System.out.println("Sifremi degistir.");
				break;
			}
			case 2:{
				System.out.println("Kullanici engelle.");
				break;
			}
			case 0:{
				System.out.println("Ana menuye donuluyor...");
				break;
			}
			default:
				System.out.println("Lutfen gecerli bir secim yapiniz.");
				break;
		}
	}
	
	private static void userMenu(User user) {
		int secim=-1;
		do {
			System.out.println("##### STANDARD USER MENU #####");
			System.out.println("1- Sifre degistir");
			System.out.println("0- Cikis yap");
			System.out.print("Seciminiz : ");
			secim=sc.nextInt();
			sc.nextLine();
			userFunctions(secim);
		}while (secim!=0);
	}
	
	private static void userFunctions(int secim) {
		switch (secim){
			case 1:{
				System.out.println("Sifremi degistir.");
				break;
			}
			case 0:{
				System.out.println("Ana menuye donuluyor...");
				break;
			}
			default:
				System.out.println("Lutfen gecerli bir secim yapiniz.");
				break;
		}
	}
	
	private static boolean checkCredentials(String username, String password) {
		boolean varMi=false;
		for (User user:userDB){
			if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
				varMi=true;
				break;
			}
		}
		return varMi;
	}
	private static User findByUsernameAndPassword(String username, String password){
		for (User user:userDB){
			if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}
}