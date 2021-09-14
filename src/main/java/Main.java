import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your username?");
        String username = scanner.nextLine();
        System.out.println("What is the password?");
        String password = scanner.nextLine();
        if(password.equals("abc$123")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }

    }
}
