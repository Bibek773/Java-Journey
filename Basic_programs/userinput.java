import java.util.Scanner;//importing scanner class from util, allowing us to take input from the user.

public class userinput
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);// Scanner class object 'scanner' created, to take input from the standard input stream (System.in), which is the keyboard

        // Reading a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();// can read true or false only

        // Reading a byte value
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();//read integer between -128 and 127 and store it in the byteValue

        // Reading a double value
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();//read floating point number

        // Reading a float value
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();// read float i.e single floating point e.g 5.4f

        // Reading an int value
        System.out.print("Enter an int value: ");
        int intValue = scanner.nextInt();// read integer value

        // Reading a String value
        scanner.nextLine(); // consume the newline if this is not here this will take enter key as a string

        System.out.print("Enter a String value: ");
        String stringValue = scanner.nextLine();// read line of text

        // Reading a long value
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong(); // read large whole number

        // Reading a short value
        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();// read short value between -32,768 and 32,767

        // Displaying the entered values
        System.out.println("Boolean value: " + boolValue);
        System.out.println("Byte value: " + byteValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Int value: " + intValue);
        System.out.println("String value: " + stringValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Short value: " + shortValue);

        scanner.close();// closing object to free system resources

    }
}