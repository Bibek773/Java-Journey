import java.util.Scanner;
public class fuction_in_java {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void mul(int a, int b) {
        int d = a * b;
        System.out.println("Multiplication is " + d);
    }

    public static void div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double c = (double) a / b;
        System.out.println("Division is " + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice: \n1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Exit");
            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Enter the first number: ");
            int a = input.nextInt();
            System.out.print("Enter the second number: ");
            int b = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition is " + add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction is " + sub(a, b));
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                default:
                    System.out.println("Enter a valid choice.");
            }
        }

        input.close();  // Close the scanner
    }
}