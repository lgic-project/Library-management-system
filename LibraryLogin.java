

public class LibraryLogin {
    public static void main(String[] args) {
        scanner input = new scanner(System.in);
        string username = "admin";
        string password = "1234";

        System.out.println("Library Management system - Login");
        system.out.print("Enter username: ");
        string user = input.nextLine();

        system.out.print("Enter password: ");
        string pass = input.nextLine();


        if(user.equals(username) && pass.equals(password)) {
            system.out.println("Login successful! Welcome to the Library Management system.");

        }else{
            system.out.println("Login failed! Incorrect username or password.");
        }
        input.close();
    }

    private static class scanner {

        public scanner() {
        }
    }
}