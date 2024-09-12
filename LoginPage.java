package GithubClassRoomPolymorphism;

public class LoginPage extends BasePageOverriding{

	public void performCommonTasks() {
		System.out.println("Add Common text");
	}
	
	public static void main(String[] args) {
		
		LoginPage LP = new  LoginPage ();
		LP.clickElement();
		LP.enterText();
		LP.performCommonTasks();
		LP.findElement();
	}

}
