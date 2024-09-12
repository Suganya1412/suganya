package GithubClassRoomInterface;

public class JavaConnection extends MySqlConnection{

	public void connect(){
		System.out.println("Connect with correct Database");
	}
	public void disconnect() {
		System.out.println("Disconnect the connection");
	}
	
	public void executeUpdate() {
		System.out.println("Execute Updated connection");
		
	}public static void main (String[] args) {
		
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();
} 
	
}
