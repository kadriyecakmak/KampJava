package inheritiance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer kadriye = new IndividualCustomer();
		kadriye.customerNumber = "11111";
		
		CorpareteCustomer jetteknoloji = new CorpareteCustomer();
		jetteknoloji.companyName = "Jetteknoloji";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customer = {
				kadriye, abc, jetteknoloji
		};
		customerManager.addMultiple(customer);
		
		
		
	}

}
