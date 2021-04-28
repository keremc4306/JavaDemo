package miniprojects;

public class Main {

	public static void main(String[] args) {
		// Asal sayı hesaplama
		// int number = 25; -> 25 asal değil
		int number = 1;
		int remainder = number % 2; // remainder:kalan değer
		// System.out.println(remainder);
		boolean isPrime = true; // prime:asal

		if (number < 2) {
			System.out.println("Geçersiz sayı");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayı asaldır");
		} 
		else {
			System.out.println("Sayı asal değildir");
		}

	}

}
