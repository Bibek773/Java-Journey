import java.util.Scanner;
public class even_odd_check {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check odd or even");
        int num = input.nextInt();
        if  (num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
