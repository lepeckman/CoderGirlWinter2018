package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class Groceries {

    public static void main(String[] args) {
        // grocery assignment

        Scanner keyboard = new Scanner(System.in);

//ask for input
        out.println("Please list 3 items on your grocery shopping list. ");

        //declare and define variables for text
        String Item1;
        out.print(" Item 1? ");
        Item1 = keyboard.nextLine();

        String Item2;
        out.print(" Item 2? ");
        Item2 = keyboard.nextLine();;

        String Item3;
        out.print(" Item 3? ");
        Item3 = keyboard.nextLine();

//ask for quantity
        out.println(" Now, please enter the quantity of each item. ");

//declare your variables before defining them, for integers

        int Quant1;
        out.print(" How many " + Item1 + "? ");
        Quant1 = keyboard.nextInt();
        keyboard.skip("\n");

        int Quant2;
        out.print(" How many " + Item2 + "? ");
        Quant2 = keyboard.nextInt();
        keyboard.skip("\n");

        int Quant3;
        out.print(" How many " + Item3 + "? ");
        Quant3 = keyboard.nextInt();
        keyboard.skip("\n");

//ask about cost, float

        out.println(" Please enter the price of each item.");

        float priceA;
        out.print(" How much does one " + Item1 + " cost? ");
        priceA = keyboard.nextFloat();
        keyboard.skip("\n");

        float priceB;
        out.print(" How much does one " + Item2 + " cost? ");
        priceB = keyboard.nextFloat();
        keyboard.skip("\n");

        float priceC;
        out.print(" How much does one " + Item3 + " cost? ");
        priceC = keyboard.nextFloat();
        keyboard.skip("\n");

//Calculate & output total grocery cost

        out.println("Calculating your grocery bill.");

        float costTotal;
        costTotal = (Quant1 * priceA) + (Quant2 * priceB) + (Quant3 * priceC);

        out.print(" Your total grocery cost is " + costTotal);

    }
}
