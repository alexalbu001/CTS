package builder;

public class User {
	
	//mandatory
private String username;
private String email;
private String firstName;
private String lastName;

//optional
	private String phoneNo;
	private String address;
	private String birthday;
	
	public User(String username, String email, String firstName, String lastName) {
		this.username=username;
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public User(String username, String email, String firstName, String lastName, String address) {
		this.username=username;
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
	}
	
//	public User(String username, String email, String firstName, String lastName, String phone) {
//		this.username=username;
//		this.email=email;
//		this.firstName=firstName;
//		this.lastName=lastName;
//		this.phone=phone;
//	}
}
