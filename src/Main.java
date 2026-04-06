import java.util.Scanner;

public class Main {
    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun;
        String verb;

        System.out.print("Enter a description: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(name or animal): ");
        noun = scanner.nextLine();
        System.out.print("Enter a description: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a continuous action: ");
        verb = scanner.nextLine();
        System.out.print("Enter an emotion: ");
        adjective3 = scanner.nextLine();


        System.out.print("\nToday I went to a "+adjective1+" zoo. ");
        System.out.print("In an exhibit, I saw a "+noun+". ");
        System.out.print("The "+noun+" was "+adjective2+ " and "+verb+". ");
        System.out.print("I was "+adjective3+"!");

        scanner.close();
    }
}
