
public class ProductManager  {

	
	public void add(Product product) {
		System.out.println("Yeni oyun listelerde sat��ta: " + product.getProductName() + " Fiyat� " + product.getUnitPrice());
		
	}

	
	public void delete(Product product) {
		System.out.println("�r�n sat��tan kald�r�ld�: " + product.getProductName());
		
	}


	public void update(Product product) {
		System.out.println("Ka��r�lmayacak indirimlerde bug�n: " + product.getProductName() + " oyunu " 
				+ product.getUnitPrice() + " fiyat�ndan y�zde " + product.getDiscount() + " indirime girerek "
				+ product.getUnitPriceAfterDiscount() + " 'dir");
		
	}

	
}
