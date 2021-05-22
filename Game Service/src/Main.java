
public class Main {

	public static void main(String[] args) {
		System.out.println("Oyun satýþ platformuna hoþ geldiniz");
		System.out.println("--------------------------------------");
		CustomerManager customerManager = new CustomerManager();
		Customer customer = new Customer(1, "Ylmazms",  1234, 21, "Erkek", 12345);
		customerManager.add(customer);
		customerManager.login(customer);
		customerManager.delete(customer);
		System.out.println("----------------------------------------");
		
		ProductManager productManager = new ProductManager();
		Product product = new Product(1, "Red Dead Redemption 2", 250, 12);
		Product product1 = new Product(2, "Cyberpunk",300, 20);
		Product product2 = new Product(3, "Stardew Valley", 60, 45);
		productManager.update(product);
		productManager.add(product1);
		productManager.update(product2);
		productManager.delete(product1);
		System.out.println("----------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Bahar indirimleri");
		Campaign campaign1 = new Campaign(2, "Cadýlar Bayramý");
		campaignManager.add(campaign1);
		campaignManager.add(campaign);
		

		

	}

}
