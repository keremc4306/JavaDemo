package arraysdemos;

public class Main {

	public static void main(String[] args) {
		/*
		//Dizilerle çalýþma
		String ogrenci1 = "Kerem";
		String ogrenci2 = "Mertcan";
		String ogrenci3 = "Edip";
		String ogrenci4 = "Serdar";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("------------------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Kerem"; //1. eleman
		ogrenciler[1] = "Edip"; //2. eleman
		ogrenciler[2] = "Serdar"; //3. eleman
		
		for(int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]); //ogrenciler'in i. elemanýný ekrana yazdýrma
		}
		
		System.out.println("------------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		*/
		
		//ReCap Demo-Dizilerle çalýþma
		double[] myList = {1.2, 6.3, 4.3, 5.6};
		//double[] myList2 = new double[4]; -> Diziyi tanýmlamanýn diðer kuralý
		
		//for(double number:myList) {
		//System.out.println(number); -> myList dizisi içindeki elemanlarý alt alta yazar
		//}
		 
		/*
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			if(max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max);
		*/
		
		/*
		//Çok boyutlu dizilerle çalýþma
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Kocaeli";
		sehirler[0][2] = "Adapazarý";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Kayseri";
		sehirler[1][2] = "Karaman";
		sehirler[2][0] = "Amasya";
		sehirler[2][1] = "Samsun";
		sehirler[2][2] = "Ordu";
		
		for(int i=0; i<=2; i++) {
			System.out.println("-------------------------");
			for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		*/
	}
}