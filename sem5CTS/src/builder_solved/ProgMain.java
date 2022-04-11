package builder_solved;

public class ProgMain {

	public static void main(String[] args) {
		
//		User u1=new User("anca@gmail.com","anca@gmail.com","anca", "b","bucharest");
//		User u2=new User("anca@gmail.com","anca@gmail.com","anca", "b","0740123456");
		
		User u= new User.UserBuilder("anca@gmail.com","anca@gmail.com","anca", "b").address("Bucharest").build();
		User u2= new User.UserBuilder("anca@gmail.com","anca@gmail.com","anca", "b").phone("0740123456").build();

	}
}
