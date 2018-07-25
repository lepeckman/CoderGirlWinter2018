import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args)
    {
        //Initial instructions from Udemy PDF - I found the assigned integers cumbersome. Are they required?
    //Don't change these lines
    Scanner keyboard = new Scanner(System.in);
    //int goalForVeggies = 50;
    //int goalForBurgers = 250;
    //int goalForSubs = 180;
    //int goalForSoup = 70;

    // 1. Veggie Sandwiches
    out.println("Checking sales goals... ");
    out.println("The sales goal for Veggie Sandwiches is 50. ");
    out.println("How many veggie sandwiches were sold today?");
    int veggieS;
    veggieS = keyboard.nextInt();

        if (veggieS >= 50) {
            out.println("Made goal for Veggie Sandwiches.");
            out.println("   ");
        }
            else {
                out.println("Fell short.");
                out.println("   ");
        }

    // 2. Burgers
    out.println("Checking sales goals... ");
    out.println("The sales goal for Burgers is 250. ");
    out.println("How many Burgers were sold today?");
    int burgers;
    burgers = keyboard.nextInt();

        if (burgers >= 250) {
            out.println("Made goal for Burgers.");
            out.println("   ");
        }
            else {
                out.println("Fell short.");
                out.println("   ");
        }

    // 3. Subs
    out.println("Checking sales goals... ");
    out.println("The sales goal for Subs is 180. ");
    out.println("How many subs were sold today?");
    int subs;
    subs = keyboard.nextInt();

        if (subs >= 180) {
            out.println("Made goal for Subs.");
            out.println("   ");
        }
            else {
                out.println("Fell short.");
                out.println("   ");
        }


    // 4. Soup
    out.println("Checking sales goals... ");
    out.println("The sales goal for bowls of Soup is 70. ");
    out.println("How many bowls of Soup were sold today?");
    int bowlSoup;
    bowlSoup = keyboard.nextInt();

        if (bowlSoup >= 70) {
            out.println("Made goal for bowls of Soup.");
            out.println("   ");
        }
            else {
                out.println("Fell short.");
                out.println("   ");
        }


    // 5. Everything?

        if ((veggieS >= 50) && (burgers >= 250) && (subs >= 180) && (bowlSoup >= 70)) {
            out.println("Made goals for everything!");
            out.println("   ");
        }
            else {
                out.println("Did not meet all goals.");
                out.println("   ");
        }


    }
}
