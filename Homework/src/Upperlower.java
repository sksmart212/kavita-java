import java.util.Scanner;

public class Upperlower {
    /** changing uppercase in lowercase */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.println("Enter a character in uppercase");
        ch = sc.next();
        System.out.println("you have entered " + ch.toLowerCase() );
    }
}
