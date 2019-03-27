import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
        /**  (Average =num1 +num2 +num3 +num4 +num5) / 5     */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num:");
        int num1  = in.nextInt();
        System.out.println("Enter second num:");
        int num2  = in.nextInt();
        System.out.println("Enter third num:");
        int num3  = in.nextInt();
        System.out.println("Enter fourth num:");
        int num4  = in.nextInt();
        System.out.println("Enter fifth num:");
        int num5  = in.nextInt();
        System.out.println("Average of five numbers is:" +(num1 +num2 +num3 +num4 +num5) / 5);



    }
}
