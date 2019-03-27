import java.util.Scanner;

public class  Check {
    public static void main(String[] args) {
        /**whether value is alphabet,digitn symbol */
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a value");
        ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))

        {
            System.out.println(ch + " is an alphabet");
        }
        else if(ch >= '0' && ch <= '9')
        {

            System.out.println(ch + " is a digit");
        }
        else
            {
                System.out.println(ch + " is special character");

            }
        }
    }
