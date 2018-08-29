import java.util.Scanner;
import static java.lang.System.out;

public class multiplicationTables {
    public static void main(String[] args) {

        //Receive input from user
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");
        out.println("What is the largest integer you would like to see in your multiplication tables?");
        //Define limiting integer
        int A = keyboard.nextInt();

        //Set lowest value of other integer
        int B = 0;

        //While integer B is less than or equal to integer A
        while (B <= A)
        {
            //Continue to add to integer B for each run, while subtracting from integer A for each run
             for (B = 0; B <= A; B++) {

                out.println(B + " * " + A + " = " + B * A + " ");

             }
             /*Works above, stuck on the descending aspect - printing goes on to infinity!
             for (B = A; B >= 0; B--){

                 out.println(B + " * " + A + " = " + B * A + " ");
             }*/
            out.println();
        }
    }


}

