import java.util.Scanner;
public class matrix_multiplication {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of matrix");
        System.out.println("Enter number of rows");
        int row= input.nextInt();
        System.out.println("Enter number of columns");
        int column= input.nextInt();

        int[][] matrix1= new int[row][column];
        int[][] matrix2= new int[row][column];
        int[][] matrix3= new int[row][column];

        //taking input
        System.out.println("FOR FIRST MATRIX");
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.println("\tEnter the data for A"+(i+1)+","+(j+1));
                matrix1[i][j]=input.nextInt();

            }

        }
        System.out.println("\nFOR SECOND MATRIX");
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.println("\tEnter the data for A"+(i+1)+","+(j+1));
                matrix2[i][j]=input.nextInt();

            }

        }

        for(int i= 0; i<row; i++) {
            for(int j= 0; j<column; j++) {
                for(int k=0; k< row; k++){// row should be of second matrix i have inserted 'row' because i have taken both of same length
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }

        }
        //displaying
        System.out.println("The matrix first  is");
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.print(matrix1[i][j]+"\t");


            }
            System.out.println();
        }
        System.out.println("The matrix Second  is");
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.print(matrix2[i][j]+"\t");


            }
            System.out.println();
        }
        System.out.println("And the multiplication of matrix1 and matrix2 is ");
        for(int i= 0; i<row; i++) {

            for(int j= 0; j<column; j++) {

                System.out.print(matrix3[i][j]+"\t");


            }
            System.out.println();
        }



    }

}