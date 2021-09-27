package Fight;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Battle {
    Scanner input = new Scanner(System.in);
    private int choice;
    public void fight(double []character, double []enemy){
        do {
            System.out.println("1.) Physical Attack\n" +
                    "2.) Magical Attack\n" +
                    "3.) Dodge\n" +
                    "4.) Items");
            try{ choice = input.nextInt(); } catch (InputMismatchException e) { System.out.println("Please input a number.\n"); }
            if (choice == 1){phyAttack(character[5],enemy[3]);}
        }
        while (character[1] > 0);

    }

    public double phyAttack(double phyA, double eDefense){
        return phyA / eDefense;
    }
}
