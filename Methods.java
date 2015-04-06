import java.util.Scanner;
public class Methods {
	
	public static void main(String[] args){
	
	String user, pass;

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter Username: ");
	user = keyboard.nextLine();
	System.out.println("Enter Password: ");
	pass = keyboard.nextLine();
	
	

		
	if(user.equals(user))
		System.out.println("Welcome " + user);
	else
		System.out.println("Wrong Username or Password");

	if(pass.equals(pass))
		System.out.println("Welcome " + user);
	else
		System.out.println("Wrong Username or Password");


	}

}