
public class CustomerManager implements ICustomerServiceManager  {
	
	public CustomerManager() {
		
	}
	
	@Override
	public void add(Customer customer) {
		System.out.println("Sisteme " + customer.getFirstName() + " "
		+ "isimli oyuncu eklenmiþtir. Tüm bilgileri doðrulanmýþtýr");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Sistemden " + customer.getFirstName() + " "
		+ "isimli oyuncu silinmiþtir. Silinen oyuncunun yaþý: " + customer.getAge() + " Cinsiyeti: " + customer.getGender()  );
		
	}

	@Override
	public void login(Customer customer) {
		if(CustomerValidator.isValid(customer)) {
			customer.getFirstName();
			customer.getPassword();
			System.out.println("Baþarýlý bir þekilde giriþ yaptýnýz");
		}
		else {
			System.out.println("Baþarýsýz bir giriþ yaptýnýz, kullanýcý adý veya þifra hatalý");
		}		
	}



	
}
