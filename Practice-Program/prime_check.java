import java.util.Scanner;

public class prime_check {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check prime");
        int num = input.nextInt();
        int count= 0;

        for (int i=1; i<=num; i++){

            if(num%i==0){
                count = count+1;
            }

        }
        if (count==2){
            System.out.println("The number "+ num +" is prime number");
        }
        else {
            System.out.println("The number "+ num +"  is not prime number");
        }

    }
}