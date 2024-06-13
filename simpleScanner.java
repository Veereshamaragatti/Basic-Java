import java.util.Scanner;

public class simpleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a single word (name):");
        String name = sc.next(); 
        sc.nextLine(); // Consume the remaining newline character

        System.out.println("Enter an entire line:");
        String entireLine = sc.nextLine(); 

        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character

        System.out.println("Enter a float:");
        float price = sc.nextFloat();
        sc.nextLine(); // Consume the remaining newline character

        // Display the inputs
        System.out.println("Name: " + name);
        System.out.println("Entire Line: " + entireLine);
        System.out.println("Integer: " + number);
        System.out.println("Float: " + price);

        sc.close(); // Always close the scanner
    }
}
