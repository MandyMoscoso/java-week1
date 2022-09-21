import java.util.Scanner;

public class Dice {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 =   rollDice();
        int roll2 =    rollDice();
        int roll3 =   rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 <1){
            System.out.println("Numbers cannot be less than 1");
        }
        scan.close();
    }

    public static int rollDice(){
        double random = Math.random() * 6;
        random++;
        return (int)random;
    }
}
