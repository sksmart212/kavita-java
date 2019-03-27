import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet between a to f  ");
        /**Display city name based on alphabet by user*/

        char ch;
        ch = sc.next().charAt(0);
        if (ch == 'a') {
            System.out.println("assam ");
        } else if (ch == 'b') {
            System.out.println("bangalore ");
        } else if (ch == 'c') {
            System.out.println("calcutta ");
        } else if (ch == 'd') {
            System.out.println("delhi ");
        } else if (ch == 'e') {
            System.out.println("egypt");
        } else if (ch == 'f') {
            System.out.println("france ");
        } else {
            System.out.println("invalid character");
        }
    }
}





