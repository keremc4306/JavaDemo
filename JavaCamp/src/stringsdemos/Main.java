package stringsdemos;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel";
		System.out.println(message);
		
		//length() fonksiyonu bize eleman sayýsýný verecektir.
		System.out.println("Eleman sayýsý = " + message.length());
		
		//charAt(4) dediðimiz zaman mesajýn 5. elemanýný basar.
		System.out.println("5. eleman = " + message.charAt(4));
		
		//2 metni birleþtirme
		System.out.println(message.concat(", Yaþasýn!"));
		
		// System.out.println(message.startsWith("A")); mesaj A harfi ile baþlamadýðý için false döner.
		System.out.println(message.startsWith("B")); //mesaj B harfi ile baþladýðý için true döner.
		
		System.out.println(message.endsWith(".")); // mesaj . ile bittiði için true döner.
		
		System.out.println(message.indexOf('a')); // Ýlk bulduðu a'da aramayý bitirir.
		System.out.println(message.indexOf("av")); //mesajýn içinde av var mý ?
		System.out.println(message.lastIndexOf("a")); // mesajýn içinde en son ki "a"nýn indisi verir 
	}
}