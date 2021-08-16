package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisServiceAdapter implements ICustomerCheckService {

	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException,  RemoteException  {
		// TODO Auto-generated method stub
		
		boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		if(result == true) {
			
			System.out.println("Baþarýlý");
			return true;
			
		}else {
		
			System.out.println("Baþarýsýz.");
			
			return false;
		}
		
	}
	

}