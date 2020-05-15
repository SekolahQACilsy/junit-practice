package rizqifauzan.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EmailTest {

	public Email email;

	@Test
	public void test_emailValid() {
		boolean check = email.checkEmail("rizqi.fauzan@mailnesia.com");
		Assert.assertEquals(true, check); 
	}
	
	@Test
	public void test_emailInvalid() {
		boolean check = email.checkEmail("rizqi.fauzan@mailnesia");
		Assert.assertEquals(false, check); 
	}
	
	@Before
	public void persiapan() {
		email = new Email(); 
		System.out.println("@Before Jalan");
	}

}
