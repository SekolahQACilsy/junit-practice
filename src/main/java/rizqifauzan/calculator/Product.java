package rizqifauzan.calculator;

import java.util.List; 
import java.util.ArrayList;

public class Product {
	
	List<String> productList = new ArrayList<>();
	
	
	public void addProduct(String product)
	{
		productList.add(product);
	}
	
	public void removeProduct(String product)
	{
		productList.remove(product);
	}
	
	public void replaceProduct(String oldProduct, String newProduct) {
		int index = productList.indexOf(oldProduct);
		productList.set(index, newProduct);
	}
	
	public boolean checkProduct(String product)
	{
		if(productList.contains(product)) {
			return true;
		}
		return false;
	}

}
