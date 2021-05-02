package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer kerem = new IndividualCustomer();
		kerem.customerNumber  = "25648";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "52616";
		
		
		SyndicateCustomer abc = new SyndicateCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {kerem, hepsiBurada, abc}; // array oluþturma
		//customerManager.add(hepsiBurada);
		//customerManager.add(kerem);
		//customerManager.add(abc);
		customerManager.addMultiple(customers);
	}

}
