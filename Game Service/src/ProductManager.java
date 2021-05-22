
public class ProductManager  {

	
	public void add(Product product) {
		System.out.println("Yeni oyun listelerde satýþta: " + product.getProductName() + " Fiyatý " + product.getUnitPrice());
		
	}

	
	public void delete(Product product) {
		System.out.println("Ürün satýþtan kaldýrýldý: " + product.getProductName());
		
	}


	public void update(Product product) {
		System.out.println("Kaçýrýlmayacak indirimlerde bugün: " + product.getProductName() + " oyunu " 
				+ product.getUnitPrice() + " fiyatýndan yüzde " + product.getDiscount() + " indirime girerek "
				+ product.getUnitPriceAfterDiscount() + " 'dir");
		
	}

	
}
