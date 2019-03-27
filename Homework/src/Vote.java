import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /** age>== 18 are elligible to vote*/
        int a;
        System.out.println("Enter age");
        a = sc.nextInt();
        if (a >= 18)
        {
            System.out.println("You are  is elligible to vote");

        }
    else
        {
            System.out.println("YOu are not elligible to vote");
        }
    }
}
