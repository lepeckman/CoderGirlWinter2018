package Tapestries;

public class BlockyBaublePattern extends Pattern{

    public BlockyBaublePattern(){

        this.needleJam = (Math.random() < 0.10d);

        //instantiate the 3 stitches we need to use
        BlockStitch newBlock = new BlockStitch();
        ShortLineStitch newDash = new ShortLineStitch();
        CircleStitch newCircle = new CircleStitch();

        for (int i = 0; i < 3; i++) {
            //the instance and the getter for the character from Stitch
            this.patternList.add(newBlock.sew());
            this.patternList.add(newDash.sew());
            this.patternList.add(newDash.sew());
            this.patternList.add(newCircle.sew());
            this.patternList.add(newDash.sew());
            this.patternList.add(newDash.sew());
        }
    }
}
