package miniprojects;

public class Main {

	public static void main(String[] args) {
		/*
		// Asal say� hesaplama
		// int number = 25; -> 25 asal de�il
		int number = 1;
		int remainder = number % 2; // remainder:kalan de�er
		// System.out.println(remainder);
		boolean isPrime = true; // prime:asal

		if (number < 2) {
			System.out.println("Ge�ersiz say�");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Say� asald�r");
		} 
		else {
			System.out.println("Say� asal de�ildir");
		}
		*/
		
		/*
		//Kal�n sesli ve ince sesli harf
		char harf = 'E';
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kal�n sesli harf");
				break;
			default:
				System.out.println("�nce sesli harf");
		}
		*/
		
		/*
		//M�kemmel say�lar
		//�rnek1: 6-> 1,2 ve 3' b�l�n�r. B�lenleri toplam� 1+2+3 = 6
		//�rnek2: 28-> 1,2,4,7,14'e b�l�n�r. B�lenleri toplam� 28
		int number = 28;
		int total = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println("M�kemmel say�d�r.");
		}
		else {
			System.out.println("M�kemmel say� de�ildir.");
		}
		*/
		
		/*
		//Arkada� say�lar
		//Kendileri hari� pozitif tam b�lenlerinin toplam� birbirine e�it olan say�lard�r.
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
			System.out.println("Bu iki say� arkada�t�r");
		}
		else {
			System.out.println("Bu iki say� arkada� de�ildir");
		}
		*/
		
		/*
		//Say� mevcut mu?
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
			System.out.println("Say� mevcut");
		}
		else {
			System.out.println("Say� mevcut de�il");
		}
		*/
	}

}
