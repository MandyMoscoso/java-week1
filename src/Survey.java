import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Survey {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");

        int counter = 0;

        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\n" + "Thank you "+name + " for answering all "+ counter + " questions");
        System.out.println("your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee prices" );
        System.out.println(("Weekly, you spend $" + (foodAmount*foodPrice)+ " on food"));
        scan.close();
    }
}
