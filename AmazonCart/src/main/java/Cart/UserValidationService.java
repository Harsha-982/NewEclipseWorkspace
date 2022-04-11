package Cart;

public class UserValidationService {
	public boolean isUserValid(String name,String password) {
		if(name.equals("Harsha") && password.equals("1234")) {
			return true;
		}
		return false;
		
	}
}
