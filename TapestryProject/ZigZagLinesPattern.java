package Tapestries;

public class ZigZagLinesPattern extends Pattern {
    //constructor
    public ZigZagLinesPattern() {

        this.needleJam = false;

        //instantiate the 2 stitches we need to use
        ZigZagStitch newZ = new ZigZagStitch();
        FillStitch newFill = new FillStitch();

        for (int i = 0; i < 2; i++) {
            //the instance of the SmallCrossStitch and the getter for the character from Stitch
            this.patternList.add(newZ.sew());
            this.patternList.add(newZ.sew());
            this.patternList.add(newZ.sew());
            this.patternList.add(newFill.sew());
            this.patternList.add(newFill.sew());
            this.patternList.add(newFill.sew());
        }
    }
}
