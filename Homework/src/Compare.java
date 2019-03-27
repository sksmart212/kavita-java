import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        /** whether number is negative or positive n zero*/
        if (n == 0)
        {


            System.out.println("Your number is zero ");

        }
        else if (n > 0)
        {
            System.out.println("Your number is positive ");
        }
      else
        {  System.out.println("Your number is negative ");}
    }
}