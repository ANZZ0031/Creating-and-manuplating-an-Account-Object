import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		System.out.println("Please enter the name");
		
		String theName = sc.nextLine();
		
		myAccount.setName(theName);
		
		System.out.println();
		
		System.out.printf("Name in the object myAccount is %n%s%n",myAccount.getName() );
		
		
		
	}

}
