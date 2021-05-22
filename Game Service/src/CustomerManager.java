
public class CustomerManager implements ICustomerServiceManager  {
	
	public CustomerManager() {
		
	}
	
	@Override
	public void add(Customer customer) {
		System.out.println("Sisteme " + customer.getFirstName() + " "
		+ "isimli oyuncu eklenmi�tir. T�m bilgileri do�rulanm��t�r");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Sistemden " + customer.getFirstName() + " "
		+ "isimli oyuncu silinmi�tir. Silinen oyuncunun ya��: " + customer.getAge() + " Cinsiyeti: " + customer.getGender()  );
		
	}

	@Override
	public void login(Customer customer) {
		if(CustomerValidator.isValid(customer)) {
			customer.getFirstName();
			customer.getPassword();
			System.out.println("Ba�ar�l� bir �ekilde giri� yapt�n�z");
		}
		else {
			System.out.println("Ba�ar�s�z bir giri� yapt�n�z, kullan�c� ad� veya �ifra hatal�");
		}		
	}



	
}
