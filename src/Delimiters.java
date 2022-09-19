import java.util.Scanner;

public class Delimiters{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two very big integers (on the same line");
        long big1 = scan.nextLong();
        long big2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line");
        double double1 = scan.nextDouble();
        double double2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tBigIntegers: " + big1 + " " + big2);
        System.out.println("\tDecimals: " + double1 + " " + double2);
        System.out.println("\tTexts: " + text1 + " " + text2);
    }
}
