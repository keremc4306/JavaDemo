package conditionals;

public class Main {

	public static void main(String[] args) {
		/*
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
		
		//If bloklar�- 3 say�dan en b�y���n� bulma
		int sayi1 = 266, sayi2 = 25, sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En b�y�k = " + enBuyuk);
	}
}