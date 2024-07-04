package week02.day04;
/*
3-   "Java,React,Spring" String degerinden bir for döngüsü içerisinde
 Java React ve Spring i ayri ayri yazdiralim.
 */
public class Question003 {
	public static void main(String[] args) {
		String metin="Java,React,Spring";
		int ilkIndex=0;
		for (int i = 0; i < metin.length() ; i++) {
			if (metin.charAt(i)==','){
				System.out.println(metin.substring(ilkIndex,i));
				ilkIndex=i+1;
			}
		}
		System.out.println(metin.substring(ilkIndex));
		System.out.println("\n ####################");
		
		for (int i = 0; i <metin.length() ; i++) {
			if (metin.charAt(i)==','){
				System.out.println();
			}
			else {
				System.out.print(metin.charAt(i));
			}
			
		}
		System.out.println("\n ####################");
		
		metin=metin.replace(",","\n");
		System.out.println(metin);
	}
}