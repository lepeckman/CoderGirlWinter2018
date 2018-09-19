import java.util.Scanner;
import static java.lang.System.out;

//See video Lesson 60 bookmark of Nested Loops - YOUR THIRD variable is the randomly selected integers from that example.
//that is your user input integer
public class multiplicationTables {
    public static void main(String[] args) {
    //Receive input from user
    Scanner keyboard = new Scanner(System.in);
    out.println("Welcome to Multiplication Tables");
    out.println("What is the largest integer you would like to see in your multiplication tables?");
    //Define limiting integer
    int userNum = keyboard.nextInt();
    //Set lowest value of other integer
    int mult = 0;
    //set the loop to run the number of times = the limiting User-generated integer
    for (mult = 0; mult < userNum + 1; mult++) {
        //Computer-generated variable counts UP to User-generated limit
        for (int otherNum = 0; otherNum < userNum + 1; otherNum++){
            out.println(mult + " * " + otherNum + " = " + mult * otherNum + " ");
        }
    }
        out.println();
}
}


