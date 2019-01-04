package Tapestries;
//this contains the main method
import java.util.ArrayList;
import static java.lang.System.out;

public class TapestryController {
    //create instance
    CrossStitchWigglePattern crossStitchWigglePatternInstance = new CrossStitchWigglePattern();
    ZigZagLinesPattern zigZagLinesPatternInstance = new ZigZagLinesPattern();
    BaublePattern baublePatternInstance = new BaublePattern();
    BlockyBaublePattern blockyBaublePatternInstance = new BlockyBaublePattern();
    BrokenWigglePattern brokenWigglePatternInstance = new BrokenWigglePattern();

    public void printWideTapestries(Pattern currentPattern){

        for(int i = 0; i < 3; i++) {

            out.println();

            for (int j = 0; j < 8; j++) {

                currentPattern.printPattern();
            }
        }
    }

    public void printTallTapestries(Pattern currentPattern){

        for(int i = 0; i < 8; i++) {

            out.println();

            for (int j = 0; j < 6; j++) {

                currentPattern.printPattern();
            }
        }
    }

    public static void main(String args[]) {
        //create instance in a static context
        TapestryController controllerInstance = new TapestryController();
        //call method
        ArrayList<Pattern> patternInstances = new ArrayList<>();
        patternInstances.add(controllerInstance.crossStitchWigglePatternInstance);
        patternInstances.add(controllerInstance.zigZagLinesPatternInstance);
        patternInstances.add(controllerInstance.baublePatternInstance);
        patternInstances.add(controllerInstance.blockyBaublePatternInstance);
        patternInstances.add(controllerInstance.brokenWigglePatternInstance);

        //ArrayList iterator
        for (Pattern currentPattern: patternInstances){

            controllerInstance.printWideTapestries(currentPattern);
        }

        out.println(" ");
        out.println(" ");

        for (Pattern currentPattern: patternInstances){

            controllerInstance.printTallTapestries(currentPattern);
        }
    }
}
