package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	public MernisServiceAdapter() {
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		try {
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalId),
					customer.getFirstName() , 
					customer.getLastName(),
					customer.getDateOfBirth().getYear());
	}
	catch (Exception e) {
		System.out.println("Not a valid person");
	}
	return serviceResult;
	}
}