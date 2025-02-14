import java.util.Scanner;

public class formatedprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str= new String[3];
        int[] num= new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the "+(i+1)+"th string");
            str[i] = sc.next();
            System.out.println("Enter the "+(i+1)+"th Integer");
            num[i] = sc.nextInt();

        }
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", str[i],num[i]);
        }
        System.out.println("================================");
        sc.close();
    }
}
