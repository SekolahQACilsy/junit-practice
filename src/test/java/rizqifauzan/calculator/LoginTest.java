package rizqifauzan.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class LoginTest {
	
	public Login login;
	
	@Before
	public void initiate()
	{
		login = new Login();
	}
	
	@Test
	public void loginSuccessTest() {
		boolean check = login.loginCheck("johndoe", "password");
		Assert.assertEquals(true, check);
	}
	
	@Test
	public void loginFailTest() {
		boolean check = login.loginCheck("johndoe", "passwordsalah");
		Assert.assertEquals(false, check);
	}

}
