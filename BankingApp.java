package bankingmanagementsystem;
import java.sql.*;
import java.util.Scanner;
import static java.lang.Class.forName;

public class BankingApp {
	private static final String url="jdbc:mysql://localhost:3306/?user=root";
	private static final String password="Srinidhi#04";
	private static final String username="root";
	public static void main(String[] args)  throws ClassNotFoundException, SQLException{
		try {
			Class.forName("com.mysql.cj,jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		   }
		try {
			Connection connection = DriverManager.getConnection(url,password,username);
			Scanner  scanner= new Scanner(System.in);
			User user=new User(connection,scanner);
			Accounts accounts=new Accounts(connection , scanner);
			AccountManager accountmanager=new AccountManager(connection, scanner);
			String email;
			long account_number;
			
			while(true) {
				System.out.println("** WELCOME TO BANK MANGEMENT SYSTREM **");
				System.out.println();
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Exit");
				System.out.println("Enter your choice");
				int choice1=scanner.nextInt();
				switch (choice1) {
				case 1:
					user.register();
					System.out.println("\033[H\033[23");
					System.out.println("User Logged In !");
				case 2:
					
				
				}
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	

}
