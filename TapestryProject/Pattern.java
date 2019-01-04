package Tapestries;//week 18 CoderGirl November Udemy Lesson 117

import static java.lang.System.out;
import java.util.ArrayList;

//this class instructs the robot to do something aka does the printing
public class Pattern {
    //will have 2 things:
    //a property - an Array List of types Stitches
    //a method called printPattern which prints all the stiches in that array
    //result will be the String of letters & symbols

    //Things are defined in Pattern in SET in the child classes' instructors

    protected ArrayList<String> patternList = new ArrayList<String>();

    protected boolean needleJam;

    public void printPattern() {

        //print
        String formattedString = patternList.toString()
                .replace(",", "")  //remove the commas
                .replace(" ", ""); //remove trailing spaces

       formattedString = formattedString.substring (1, formattedString.length() - 1);

                /*oh no! but what about BlockyBaublePattern
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket*/

        if (needleJam) {

            final int mid = formattedString.length() / 2; //get the middle of the String
            out.print(formattedString.substring(0, mid));

        } else {//print whole thing

            out.print(formattedString);
        }

    }

    //'has a's'
    //the pattern is an ArrayList of Stitch (the base class)
    //ArrayList<Stitch>
    //call the ArrayList from the Subclasses
    //the stuff that's different goes in the subclasses
    //double jamRate

    //
    //This is where you call each pattern to print:

    //1. For each pattern, print a band 8 pattern-blocks wide and 3 rows tall.
    //2. Leave a few blank lines.
    //3. For each pattern, print a band 6 pattern-blocks wide and 8 rows tall.
}
