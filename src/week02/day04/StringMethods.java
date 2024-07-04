package week02.day04;

public class StringMethods {
	public static void main(String[] args) {
		String value = " Merhaba Dunya ";
		String value2="Merhaba Dunya";
		System.out.println(value.charAt(2)); // 2.Indexteki karakteri gosterir.
		System.out.println(value.trim().charAt(2)); // trim() methodu bosluklari siler.
		System.out.println(value2.length()); // string'in uzunlugunu verir.
		System.out.println(value2.indexOf('a')); // a harfinin ilk goruldugu indexi verir.
		System.out.println(value2.lastIndexOf('a')); // a harfinin son goruldugu indexi verir.
		System.out.println(value2.substring(5)); // 5.index'den itibaren yazdirir. (5.index dahil)
		System.out.println(value2.substring(0,5));// 0 ile 5 arasindaki indexleri yazdirir.[0,5)
		System.out.println(value.equals(value2)); // string karsilastirma
		System.out.println(value.trim()==value2); // yeni bir nesne olusturdugu icin false olur.
		System.out.println(value.trim().equals(value2));// equals methodu ile ham degerine baktigimiz icin true olur.
		
	}
}