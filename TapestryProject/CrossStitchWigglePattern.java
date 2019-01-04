package Tapestries;

public class CrossStitchWigglePattern extends Pattern{

    //constructor
    public CrossStitchWigglePattern() {

        this.needleJam = (Math.random() < 0.05d);

        //instantiate the 2 stitches we need to use
        SmallCrossStitch newSmallX = new SmallCrossStitch();
        LargeCrossStitch newLargeX = new LargeCrossStitch();

        for (int i = 0; i < 5; i++) {
            //the instance of the SmallCrossStitch and the getter for the character from Stitch
            this.patternList.add(newSmallX.sew());
            this.patternList.add(newLargeX.sew());
        }
    }
    //has-a
    //ArrayList<Stitch> inherited from ...

    //create the stitches, fill the list, set the jam rate
}

