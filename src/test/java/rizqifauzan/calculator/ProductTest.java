package rizqifauzan.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ProductTest {
	
	public Product product;
	
	@Before
	public void initiate() {
		product = new Product();
		product.addProduct("Mazda");
		product.addProduct("Marcedes");
	}
	
	@Test
	public void addProductTest() {
		String newProduct = "BMW";
		product.addProduct(newProduct);
		Assert.assertEquals(true, product.checkProduct(newProduct));
	}
	
	@Test
	public void replaceProductTest() {
		product.replaceProduct("Marcedes", "Ferrari");
		Assert.assertEquals(false, product.checkProduct("Marcedes"));
		Assert.assertEquals(true, product.checkProduct("Ferrari"));
	}
	
	@Test
	public void removeProductTest() {
		product.removeProduct("Mazda");
		Assert.assertEquals(false, product.checkProduct("Mazda"));
	}

}
