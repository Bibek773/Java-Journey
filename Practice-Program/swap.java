import java.util.Scanner;
public class swap {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter first name");
//        String fname = input.nextLine();
//        System.out.println("Enter second name");
//        String lname = input.nextLine();
//        System.out.println("First name = " + fname+ " Last name= " + lname);
//        String temp = fname;
//        fname = lname;
//        lname = temp;
//        System.out.println("First name = " + fname+ " Last name= " + lname);

        System.out.println("Enter value of a");
        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a is " + a + ". And value of b is " + b +".");
    }
}