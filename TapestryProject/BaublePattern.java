package Tapestries;

public class BaublePattern extends Pattern {

    //constructor
    public BaublePattern() {

        this.needleJam = false;

        //instantiate the 2 stitches we need to use
        ShortLineStitch newDash = new ShortLineStitch();
        CircleStitch newCircle = new CircleStitch();

        for (int i = 0; i < 5; i++) {
            //the instance and the getter for the character from Stitch
            this.patternList.add(newDash.sew());
            this.patternList.add(newDash.sew());
            this.patternList.add(newCircle.sew());
        }
    }
}
