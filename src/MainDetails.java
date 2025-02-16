import java.util.Scanner;

public class MainDetails {

    public void mainMenu()
    {
        System.out.println("Welcome to the Gym Management System");
        System.out.println("Please select an option from the menu below:");
        System.out.println("1. Admin Login.");
        System.out.println("2. Trainer Login");
        System.out.println("3. Exit");

    }

    public int getChoice()
    {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        while(!choice.matches("[1-9]"))
        {
            System.out.println("Invalid input try again.");
            choice = sc.nextLine();
        }
        return Integer.parseInt(choice);
    }

    public void adminMenu()
    {
        System.out.println("Admin Menu");
        System.out.println("Please select an option from the menu below:");
        System.out.println("1. Add a new trainer");
        System.out.println("2. Remove a trainer");
        System.out.println("3. Display all trainers");
        System.out.println("4. Logout from admin menu");
    }

    public void trainerMenu()
    {
        System.out.println("Trainer Menu");
        System.out.println("Please select an option from the menu below:");
        System.out.println("1. Add a new member");
        System.out.println("2. Add a new class");
        System.out.println("3. Register a member for a class");
        System.out.println("4. Cancel a registration");
        System.out.println("5. Display all members");
        System.out.println("6. Display all classes");
        System.out.println("7. Display all Registrations");
        System.out.println("8. Logout from Trainer menu");
    }


}
