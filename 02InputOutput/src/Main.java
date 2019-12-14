import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.println("Welcome " + name + " to java programming!");

        // fun with numbers
        System.out.print("enter first number");
        int firstNumer = sc.nextInt();
        System.out.print("enter second number");
        int secondNumer = sc.nextInt();
        int sum = firstNumer + secondNumer;
        System.out.println(firstNumer + " + " + secondNumer + " = " + sum);

    }
}
