package GithubClassRoom.Week6HomeAssingment;

public class chrome extends Browser{
	
	public void downloads() {
		System.out.println("Download the File");
		
	}public void inprivate() {
System.out.println("Open in private tab");

	}public void webcapture() {
		System.out.println("Capture the Web application");
		
	}public static void main(String[] args) {
	
		chrome Ch= new chrome();
		Ch.bookmark();
		Ch.downloads();
		Ch.inprivate();
		Ch.newTab();
		Ch.search();
		Ch.history();
		Ch.password();
		Ch.settings();
		Ch.favourites();
		Ch.bookmark();
		Ch.refresh();
		Ch.zoom();
		Ch.print();
		Ch.moretools();
		
	}

}
