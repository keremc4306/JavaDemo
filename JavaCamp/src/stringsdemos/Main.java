package stringsdemos;

public class Main {

	public static void main(String[] args) {
		String message = "Bug�n hava �ok g�zel";
		System.out.println(message);
		
		/*
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
		System.out.println(message.lastIndexOf("a")); // mesaj�n i�inde en son ki "a"n�n indisi verir.
		*/
		
		/*
		System.out.println(message.replace(' ', '-')); //replace metodu aralar�nda bo�luk g�rd��� yere - koydu.
		
		//substring metodu: Bir metnin i�erisinden par�a al�n�r.
		System.out.println(message.substring(2)); //2. indexinden itibaren mesaj� yazar
		
		//substring metodu di�er kullan�m�: 2. indexten istedi�imiz indexe kadar keser.
		System.out.println(message.substring(2, 4)); //2'den ba�la 4'e kadar
		System.out.println(message.substring(2, 5)); //2'den ba�la 5'e kadar (n harfinden sonra bo�lu�u dahil etmeyecek.)
		
		//split fonksiyonu: Bir metni belli bir karakter veya karakter dizisini dikkate alarak par�alamaya yarar.
		for(String kelime:message.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(message.toLowerCase()); //kelimelerin b�t�n harflerini k���k harfe �evirecek.
		System.out.println(message.toUpperCase()); //kelimelerin b�t�n harflerini b�y�k harfe �evirecek.
		*/	
	}
}