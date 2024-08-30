package week5.Day2.HomeAssingments;

public class Library {

	public String addbook (String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
public void issueBook() {
	System.out.println("Book issued successfully");
	
}public static void main(String[] args) {
	Library Management = new Library();
	String Library = Management.addbook("LibraryManagement");
		Management.issueBook();
	
}
}
