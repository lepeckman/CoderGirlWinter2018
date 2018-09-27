//2018.09.12
//completed on 2018.09.19
//from section 6.78 of Udemy course
import static java.lang.System.out;
//final average temp should be 73 or 74
public class multidimensionalTemperatures {
//this method parameter, String[]args, accepts all the arguments from our entire program
    public static void main(String[] args) {

        int[][] grid = new int[4][7]; // 4 rows and 7 columns
        grid[0][0] = 68;
        grid[0][1] = 70;
        grid[0][2] = 76;
        grid[0][3] = 70;
        grid[0][4] = 68;
        grid[0][5] = 71;
        grid[0][6] = 75;
        grid[1][0] = 76;
        grid[1][1] = 76;
        grid[1][2] = 87;
        grid[1][3] = 84;
        grid[1][4] = 82;
        grid[1][5] = 75;
        grid[1][6] = 83;
        grid[2][0] = 73;
        grid[2][1] = 72;
        grid[2][2] = 81;
        grid[2][3] = 78;
        grid[2][4] = 76;
        grid[2][5] = 73;
        grid[2][6] = 77;
        grid[3][0] = 64;
        grid[3][1] = 65;
        grid[3][2] = 69;
        grid[3][3] = 68;
        grid[3][4] = 70;
        grid[3][5] = 74;
        grid[3][6] = 72;


        //in the future, the index position within the SOLUTION ARRAY for the rows & columns substitutes for "sumRowA," etc.

        int sumRowA = 0;
        int sumRowB = 0;
        int sumRowC = 0;
        int sumRowD = 0;

        int sumColumnSun = 0;
        int sumColumnMon = 0;
        int sumColumnTues = 0;
        int sumColumnWed = 0;
        int sumColumnThurs = 0;
        int sumColumnFri = 0;
        int sumColumnSat = 0;

//the temps from rows in outer loop
        for (int column = 0; column < grid[0].length; column++) {

            //grid[X].length = length of a row


            sumRowA = grid[0][column] + sumRowA ;
            sumRowB = grid[1][column] + sumRowB;
            sumRowC = grid[2][column] + sumRowC;
            sumRowD = grid[3][column] + sumRowD;}

            //grid.length = number of rows?

        for (int row = 0; row < grid.length; row++){

                sumColumnSun = grid[row][0] + sumColumnSun;
                sumColumnMon = grid[row][1] + sumColumnMon;
                sumColumnTues = grid[row][2] + sumColumnTues;
                sumColumnWed = grid[row][3] + sumColumnWed;
                sumColumnThurs = grid[row][4] + sumColumnThurs;
                sumColumnFri = grid[row][5] + sumColumnFri;
                sumColumnSat = grid[row][6] + sumColumnSat;

            }


        out.println(" ");
        out.println("Temperature Calculator: ");
        out.println(" ");
        out.println("The data provided are: ");
        out.println("7 AM: 68, 70, 76, 70, 68, 71, 75");
        out.println("3 PM: 76, 76, 87, 84, 82, 75, 83");
        out.println("7 PM: 73, 72, 81, 78, 76, 73, 77");
        out.println("3 AM: 64, 65, 69, 68, 70, 74, 72");
        out.println(" ");

        out.println("The Average temperature on Sunday was: " + sumColumnSun/grid.length);
        out.println("The Average temperature on Monday was: " + sumColumnMon/grid.length);
        out.println("The Average temperature on Tuesday was: " + sumColumnTues/grid.length);
        out.println("The Average temperature on Wednesay was: " + sumColumnWed/grid.length);
        out.println("The Average temperature on Thursday was: " + sumColumnThurs/grid.length);
        out.println("The Average temperature on Friday was: " + sumColumnFri/grid.length);
        out.println("The Average temperature on Saturday was: " + sumColumnSat/grid.length);

        out.println("");
        out.println("The Average temperature at 7:00am this week was: " + sumRowA/grid[0].length);
        out.println("The Average temperature at 3:00PM this week was: " + sumRowB/grid[0].length);
        out.println("The Average temperature at 7:00PM this week was: " + sumRowC/grid[0].length);
        out.println("The Average temperature at 3:00am this week was: " + sumRowD/grid[0].length);
        out.println("");

        //rather than average the averages, add all row totals and divide by total number of elements
        out.println("The Average temperature for the entire week was: " + ((sumRowA + sumRowB + sumRowC + sumRowD)/(grid.length * grid[0].length)));
        out.println("");

//What was this from Notes on MultiDimensional arrays? to what might it apply?

        //out.println(row + ", " + column + ", " + grid[row][column]);
    }
}


