package GithubClassRoom.Week6HomeAssingment;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("Click Check Box Button");
	}

	public static void CheckBoxButton() {
		CheckBoxButton CBB = new CheckBoxButton();
		CBB.click = "Click()";
		CBB.setText = "Select";
		CBB.clickCheckButton();
		CBB.getText();
		CBB.submit();
		
		
				
		
	}
}
