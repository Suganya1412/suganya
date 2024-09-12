package GithubClassRoom.Week6HomeAssingment;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter Valid User Name");
	}
public void enterPassword() {
	System.out.println("Enter Valid Password");
}	
	public static void main(String[] args) {
		
		LoginTestData LT = new LoginTestData();
		LT.enterCredentials();
		LT.navigateToHomePage();
		LT.enterUsername();
		LT.enterPassword();
	}

}
