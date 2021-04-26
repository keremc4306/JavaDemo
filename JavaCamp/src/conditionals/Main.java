package conditionals;

public class Main {

	public static void main(String[] args) {
		/*
		//If bloklarýyla çalýþma
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
		
		/*
		//If bloklarý demo - 3 sayýdan en büyüðünü bulma
		int sayi1 = 266, sayi2 = 25, sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " + enBuyuk);
		*/
		
		/*
		//Switch bloklarý
		char grade = 'A';
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel, geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel, geçtiniz");
				break;
			case 'C':
				System.out.println("Ýyi, geçtiniz");
				break;
			
			//Grade deðeri B veya C olursa "Ýyi, geçtiniz" mesajý görünür.	
			//case 'B':
			//case 'C':
				//System.out.println("Ýyi, geçtiniz");
				//break;
			case 'D':
				System.out.println("Fena deðil, geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef kaldýnýz");
				break;
			default:
				System.out.println("Geçersiz not giriþi");
		}
		*/
		
		/*
		//For döngüsü
		//i++ demekle i=i+1 demek arasýnda fark yok
		//Sayaç: i=1, Þart: i < 10, i++ sayacýn kaçar kaçar artacaðýný bize söyler.
		//i+=2 demek i deðerini 2'þer 2'þer arttýr demek
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti");
		*/
		
		/*
		//While döngüsü
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++; //1'den 9'a kadar sayýlarý yazdýrýr.
		  //i+=2; 1'den 9'a kadar tek sayýlarý yazdýrýr.
		}
		//Sonucunda sonsuz döngü (infinite loop) ile karþýlaþýrýz. Sonsuz kere i'nin deðeri 1 olacak 
		*/
		
		/*
		//Do-While döngüsü
		int j = 1;
		//int j = 100; dersek ekrana sadece 100'ü basar.
		do {
			System.out.println("Loglandý");
			System.out.println(j);
			j += 2;
		}while(j<10);
		System.out.println("Do-While döngüsü bitti");
		*/
	}
}