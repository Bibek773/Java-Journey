import java.util.Scanner;
public class twodimentionarray
{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        System.out.println("Enter number of rows");
        int row= input.nextInt();
        System.out.println("Enter number of columns");
        int column= input.nextInt();

        int[][] matrix= new int[row][column];

        //taking input
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.println("Enter the data for A"+(i+1)+","+(j+1));
                matrix[i][j]=input.nextInt();

            }

        }
        //displaying
        System.out.println("The matrix is");
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.print(matrix[i][j]+"\t");


            }
            System.out.println();
        }



    }

}