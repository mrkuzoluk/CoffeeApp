package Main;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	    public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		Customer customer1 = new Customer();
		customer1.setFirstName("Hakan");
		customer1.setLastName("Kuzoluk");
		customer1.setNationalityId("19072765434");
		customer1.setDateOfBirth(2001);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		
	}

}