import static java.lang.System.out;


public class CalculatorMethods
{
    public static int add(int A, int B)
    {
        return A + B;
    }
    public static int subtract(int A, int B)
    {
        return A - B;
    }
    public static int multiply(int A, int B)
    {
        return A * B;
    }
    public static int divide(int A, int B)
    {
        return A / B;
    }


    public static void main(String[] args)
    {
//Call add function, save as variable x
        int x = add(5,7);

//Print out value of x in our print statement
        out.println("5 plus 7 equals " + x);

//Do similarly without variable x
        out.println("3 plus 5 equals " + add(3, 5));
        out.println("1 plus 2 equals " + add(1, 2));
//Ensure subtraction method functions
        out. println("9 minus 4 equals " + subtract(9, 4));
        out. println("9 minus 3 equals " + subtract(9, 3));
//Ensure multiplication method works
        out.println("3 times 3 equals " + multiply(3, 3));
        out.println("2 times 4 equals " + multiply(2, 4));
//Ensure division method works
        out.println("9 divided by 3 equals " + divide(9, 3));
        out.println("12 divided by 6 equals " + divide(12, 6));
    }
}
