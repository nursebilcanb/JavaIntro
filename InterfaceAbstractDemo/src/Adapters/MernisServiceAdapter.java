package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements ICustomerCheckService {


	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
