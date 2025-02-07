import java.util.Scanner;
public class factorial {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial");
        int fact= input.nextInt();
        int n = fact;
        int r= 1;
        while(fact!=0){
            r=r*fact;
            fact=fact -1;
        }
        System.out.println("The factorial of " + n +" is " + r + ".");

    }
}