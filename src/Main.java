import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Aykut","Þahin", new Date(1998,7,23), "45622288862"));
		
		//Kimlik bilgilerini temsili olarak giriyorum. Herhangi bir veri sizintisi olmamasi icin 
		//Program duzgun calisiyor
		

	}

}
