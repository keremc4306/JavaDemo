package conditionals;

public class Main {

	public static void main(String[] args) {
		/*
		//If bloklar�yla �al��ma
		int sayi = 24;
		
		//�rne�in say�n�n de�eri 14 ise if blo�u �al���r.
		if (sayi < 20) {
			System.out.println("Say� 20'den k���k");
		}
		
		else if(sayi == 20) {
			System.out.println("Say� 20'ye e�it");
		}
		
		//�rne�in say�n�n de�eri 24 ise else blo�u �al���r.
		else {
			System.out.println("Say� 20'den k���k de�il");
		}
		
		/*
		//Say�n�n de�eri 15'ten b�y�k ise bu if blo�u �al��maz.
		if (sayi < 15) {
			System.out.println("Say� 20'den k���k");
		}
		*/
		
		/*
		//If bloklar� demo - 3 say�dan en b�y���n� bulma
		int sayi1 = 266, sayi2 = 25, sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En b�y�k = " + enBuyuk);
		*/
		
		/*
		//Switch bloklar�
		char grade = 'A';
		switch(grade) {
			case 'A':
				System.out.println("M�kemmel, ge�tiniz");
				break;
			case 'B':
				System.out.println("�ok g�zel, ge�tiniz");
				break;
			case 'C':
				System.out.println("�yi, ge�tiniz");
				break;
			
			//Grade de�eri B veya C olursa "�yi, ge�tiniz" mesaj� g�r�n�r.	
			//case 'B':
			//case 'C':
				//System.out.println("�yi, ge�tiniz");
				//break;
			case 'D':
				System.out.println("Fena de�il, ge�tiniz");
				break;
			case 'F':
				System.out.println("Maalesef kald�n�z");
				break;
			default:
				System.out.println("Ge�ersiz not giri�i");
		}
		*/
		
		/*
		//For d�ng�s�
		//i++ demekle i=i+1 demek aras�nda fark yok
		//Saya�: i=1, �art: i < 10, i++ sayac�n ka�ar ka�ar artaca��n� bize s�yler.
		//i+=2 demek i de�erini 2'�er 2'�er artt�r demek
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("D�ng� bitti");
		*/
		
		/*
		//While d�ng�s�
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++; //1'den 9'a kadar say�lar� yazd�r�r.
		  //i+=2; 1'den 9'a kadar tek say�lar� yazd�r�r.
		}
		//Sonucunda sonsuz d�ng� (infinite loop) ile kar��la��r�z. Sonsuz kere i'nin de�eri 1 olacak 
		*/
		
		/*
		//Do-While d�ng�s�
		int j = 1;
		//int j = 100; dersek ekrana sadece 100'� basar.
		do {
			System.out.println("Logland�");
			System.out.println(j);
			j += 2;
		}while(j<10);
		System.out.println("Do-While d�ng�s� bitti");
		*/
	}
}