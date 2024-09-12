package GithubClassRoomPolymorphism;

public class APIClient {

	
	public void sendRequest(String endpoint) {
		System.out.println("Send Request to Main Method"+" "+endpoint);
			}
	
	public void sendRequest(String endpoint, String requestBody, boolean  requestStatus) {
		System.out.println("Overloading SendRequest"+" "+endpoint);
		System.out.println("Provide a Request Body"+" "+requestBody);
		System.out.println("success"+" "+requestStatus);
	} 
	
	public static void main(String[] args) {
		APIClient API = new APIClient();
		API.sendRequest("api.example.com1");
		API.sendRequest("api.example.com2","body",true);
		
		
		
	}
}