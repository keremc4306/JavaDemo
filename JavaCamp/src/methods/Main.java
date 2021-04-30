package methods;

public class Main {
	
	/*
	public static void findNumber() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int lookFor = 6;
		boolean isItOk = false;
		
		for(int number : numbers) {
			if(number==lookFor) {
				isItOk = true;
				break;
			}
		}
		
		String msg = "";
		if(isItOk) {
			msg = "Number is available: " + lookFor;
			giveMessage(msg);
		}
		else {
			System.out.println("Number is not available");
		}
	}
	
	public static void giveMessage(String msg) {
		System.out.println(msg);
	}
	*/
	
	public static int topla(int s1, int s2) {
		return s1 + s2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

	public static void main(String[] args) {
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int number = topla(26,34);
		System.out.println(number);
	}

}
