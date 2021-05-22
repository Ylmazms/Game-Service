
public class Customer {

	private int id;
	private String firstName;
	private int password;
	private int age;
	private String gender;
	private int identificationNumber;
	
	public Customer () {
		
	}
	
	public Customer(int id, String firstName, int password,  int age, String gender,
			int identificationNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.identificationNumber = identificationNumber;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getPassword() {
		return password;
	}


	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setPassword(int password) {
		this.password = password;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
}
