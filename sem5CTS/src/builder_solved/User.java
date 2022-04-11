package builder_solved;

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
	
	public User(UserBuilder u) {
		//mandatory
		this.username=username;
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		
		//optional
		this.address=u.address;
		this.birthday=u.birthday;
		this.phoneNo=u.phoneNo;
		
	}
	
	public static class UserBuilder{
		
//mandatory
		private String username;
		private String email;
		private String firstName;
		private String lastName;

//optional
		private String phoneNo;
		private String address;
		private String birthday;
		
		public UserBuilder(String username, String email, String firstName, String lastName) {
			this.username=username;
			this.email=email;
			this.firstName=firstName;
			this.lastName=lastName;
		}
		
		public UserBuilder birthday(String birthday) {
			this.birthday=birthday;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address=address;
			return this;
		}
		
		public UserBuilder phone(String phoneNo) {
			this.phoneNo=phoneNo;
			return this;
		}
		
		public User build() {
			User u=new User(this);
			return u;
		}
	}

}
