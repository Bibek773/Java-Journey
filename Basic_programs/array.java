import java.util.Scanner;
public class array
{

    public static void main(String[] args){

//        String[] cars= new String[2];
//        cars[0]="bugatti";
//        cars[1]="bmw";
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = input.nextInt();
        input.nextLine();
        String[] student= new String[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+ (i+1) +"th student name");
            student[i]=input.nextLine();

        }
        System.out.println("Name of student are as follow");
        for(int i=0; i<n; i++){
            System.out.println((i+1)+". "+student[i]);


        }

    }

}