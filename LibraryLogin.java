import java.util.Scanner;

public class LibraryLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "aska";
        String password = "111";

        System.out.println("Library Management System");
        
        System.out.print("Enter username: ");
        String user = input.nextLine();

        System.out.print("Enter password: ");
        String pass = input.nextLine();


        if(user.equals(username) && pass.equals(password)) {
            System.out.println("Login successful! Welcome to the Library Management system.");

        }else{
            System.out.println("Login failed! Incorrect username or password.");
        }
        input.close();
    }

}
