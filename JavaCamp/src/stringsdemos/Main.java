package stringsdemos;

public class Main {

	public static void main(String[] args) {
		String message = "Bug�n hava �ok g�zel";
		System.out.println(message);
		
		//length() fonksiyonu bize eleman say�s�n� verecektir.
		System.out.println("Eleman say�s� = " + message.length());
		
		//charAt(4) dedi�imiz zaman mesaj�n 5. eleman�n� basar.
		System.out.println("5. eleman = " + message.charAt(4));
		
		//2 metni birle�tirme
		System.out.println(message.concat(", Ya�as�n!"));
		
		// System.out.println(message.startsWith("A")); mesaj A harfi ile ba�lamad��� i�in false d�ner.
		System.out.println(message.startsWith("B")); //mesaj B harfi ile ba�lad��� i�in true d�ner.
		
		System.out.println(message.endsWith(".")); // mesaj . ile bitti�i i�in true d�ner.
		
		System.out.println(message.indexOf('a')); // �lk buldu�u a'da aramay� bitirir.
		System.out.println(message.indexOf("av")); //mesaj�n i�inde av var m� ?
		System.out.println(message.lastIndexOf("a")); // mesaj�n i�inde en son ki "a"n�n indisi verir 
	}
}