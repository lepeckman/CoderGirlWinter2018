package Tapestries;

public class BrokenWigglePattern extends Pattern {

    //constructor
    public BrokenWigglePattern() {

        this.needleJam = (Math.random() < 0.40d);

    //instantiate the 2 stitches we need to use
    SmallCrossStitch newSmallX = new SmallCrossStitch();
    LargeCrossStitch newLargeX = new LargeCrossStitch();

        for (int i = 0; i < 5; i++) {
        //the instance of the SmallCrossStitch and the getter for the character from Stitch
        this.patternList.add(newSmallX.sew());
        this.patternList.add(newLargeX.sew());
        }
    }
}
