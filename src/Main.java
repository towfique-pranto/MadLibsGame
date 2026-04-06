import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun;
        String verb;

        System.out.print("Enter a description: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter a description: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a continuous action: ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();


        System.out.println("Today I went to a "+adjective1+" zoo");
        System.out.println("In an exhibit, I saw a "+noun+".");
        System.out.println(noun+" was "+adjective2+ " and "+verb);
        System.out.println("I was "+adjective3);

        scanner.close();
    }
}
