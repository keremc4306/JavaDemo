package conditionals;

public class Main {

	public static void main(String[] args) {
		/*
		int sayi = 24;
		
		//Örneðin sayýnýn deðeri 14 ise if bloðu çalýþýr.
		if (sayi < 20) {
			System.out.println("Sayý 20'den küçük");
		}
		
		else if(sayi == 20) {
			System.out.println("Sayý 20'ye eþit");
		}
		
		//Örneðin sayýnýn deðeri 24 ise else bloðu çalýþýr.
		else {
			System.out.println("Sayý 20'den küçük deðil");
		}
		
		/*
		//Sayýnýn deðeri 15'ten büyük ise bu if bloðu çalýþmaz.
		if (sayi < 15) {
			System.out.println("Sayý 20'den küçük");
		}
		*/
		
		//If bloklarý- 3 sayýdan en büyüðünü bulma
		int sayi1 = 266, sayi2 = 25, sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " + enBuyuk);
	}
}