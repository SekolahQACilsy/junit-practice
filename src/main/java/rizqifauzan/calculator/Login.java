package rizqifauzan.calculator;

public class Login {
	
	public boolean loginCheck(String username, String password) {
		
		String validUsername = "johndoe"; 
		String validPassword = "password";
		if( username == validUsername && password == validPassword ) {
			return true;
		}
		return false;
	}
}
