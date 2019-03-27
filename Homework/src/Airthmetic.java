import java.util.Scanner;

public class Airthmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**function take two value from user along with airthmetic operator.Based on operator program perform
         function */
        int a;
        int b;
        System.out.println("Enter  the first number");
        a = sc.nextInt();
        System.out.println("Enter  the second number");
         b = sc.nextInt();
        System.out.println("Enter  the Arthimetic Operator");
        String t =sc.next();
        if ( t.equals("+"))
        {
            System.out.println("the value is  "+ (a + b));
        }
       else if ( t.equals("-"))
        {
            System.out.println("the value is  "+ (a - b));

        }
        else if ( t.equals("*"))
        {
            System.out.println("the value is  "+ (a * b));

        }
        else if ( t.equals("/"))
        {
            System.out.println("the value is  "+ (a / b));

        }
        else{
            System.out.println("enter valid airthmetic operator");

        }








    }
}

