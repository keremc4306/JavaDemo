package miniprojects;

public class Main {

	public static void main(String[] args) {
		/*
		// Asal sayý hesaplama
		// int number = 25; -> 25 asal deðil
		int number = 1;
		int remainder = number % 2; // remainder:kalan deðer
		// System.out.println(remainder);
		boolean isPrime = true; // prime:asal

		if (number < 2) {
			System.out.println("Geçersiz sayý");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayý asaldýr");
		} 
		else {
			System.out.println("Sayý asal deðildir");
		}
		*/
		
		/*
		//Kalýn sesli ve ince sesli harf
		char harf = 'E';
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalýn sesli harf");
				break;
			default:
				System.out.println("Ýnce sesli harf");
		}
		*/
		
		/*
		//Mükemmel sayýlar
		//Örnek1: 6-> 1,2 ve 3' bölünür. Bölenleri toplamý 1+2+3 = 6
		//Örnek2: 28-> 1,2,4,7,14'e bölünür. Bölenleri toplamý 28
		int number = 28;
		int total = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println("Mükemmel sayýdýr.");
		}
		else {
			System.out.println("Mükemmel sayý deðildir.");
		}
		*/
		
		/*
		//Arkadaþ sayýlar
		//Kendileri hariç pozitif tam bölenlerinin toplamý birbirine eþit olan sayýlardýr.
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<sayi1; i++) {
			if(sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		
		for(int i=1; i<sayi2; i++) {
			if(sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu iki sayý arkadaþtýr");
		}
		else {
			System.out.println("Bu iki sayý arkadaþ deðildir");
		}
		*/
		
		/*
		//Sayý mevcut mu?
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean isItOk = false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				isItOk = true;
				break;
			}
		}
		
		if(isItOk) {
			System.out.println("Sayý mevcut");
		}
		else {
			System.out.println("Sayý mevcut deðil");
		}
		*/
	}

}
