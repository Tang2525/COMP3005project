//import the sql here
public class main{
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Welcome To LookInnaBook");
        System.out.println("logged in as:\t" + user.name);
    }

    public static void displayMenu(User user){
        System.out.println("What would you like to do:");
        System.out.println("1. View books");
        System.out.println("2. View cart");
        System.out.println("3. Search for Book");
    }
}


