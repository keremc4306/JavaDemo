package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		//De�i�kenler
		String internetSubeButonu = "�nternet �ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButonu);
		
		//�art bloklar�
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar d��t�");
		}
		
		else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi");
		}
		
		else {
			System.out.println("Dolar e�ittir");
		}
		
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i kredisi";
		String kredi5 = "MSB kredisi";
		String kredi6 = "Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		//Diziler
		String[] krediler =
			{
					"H�zl� kredi",
					"Mutlu emekli kredisi",
					"Konut kredisi",
					"�ift�i kredisi",
					"MSB kredisi",
					"Meb kredisi",
					"K�lt�r Bakanl��� kredisi"
			};
		
		//foreach d�ng�s�
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
		
		//klasik for d�ng�s�
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		//De�er ve referans tipleri (67-83)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
	}
}