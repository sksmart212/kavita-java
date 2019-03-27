import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        /** vowels are a,e,i,o,u*/
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

        System.out.println("Character is a vowel");
        else
        {
            System.out.println("Character is a constant");
        }
    }
}




