package methods;

public class Main {
	
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

	public static void main(String[] args) {
		findNumber();

	}

}
