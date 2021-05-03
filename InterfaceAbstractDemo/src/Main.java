
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setNationalityId("11785250986");
		customer1.setFirstName("Nursebil");
		customer1.setLastName("Canbolat");
		customer1.setDateOfBirth(new GregorianCalendar(2001, 6 , 5).getTime());
		

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer1);

	}
}
