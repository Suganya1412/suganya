package GithubClassRoom.Week6HomeAssingment;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("Click on the submit button");
		
	}

	public static void main(String[] args) {
		Button B = new Button();
		B.click = "Click()";
		B.setText = "Select";
		B.submit();
		

	}

}
