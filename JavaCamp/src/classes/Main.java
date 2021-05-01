package classes;

public class Main {

	public static void main(String[] args) {
		/*
		//Bellekte CustomerManager türünde custManager nesnesi ürettik.
		//reference type
		CustomerManager custManager;
		CustomerManager custManager2 = new CustomerManager();
		custManager = custManager2; //referans numaraları birbirine eşit
		custManager.Add();
		custManager.Remove();
		custManager.Update();
		*/
		
		FourOperations fOprs = new FourOperations();
		int result = fOprs.Add(19, 30);
		System.out.println(result);
		
	}

}
