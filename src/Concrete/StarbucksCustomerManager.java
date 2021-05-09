package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		_customerCheckService = customerCheckService;
	}
	
    @Override
	public void Save(Customer customer) {

		if (_customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
			
		} else {System.out.println("Not a valid person");}

	}
}
