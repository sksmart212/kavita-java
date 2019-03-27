import java.util.Scanner;

public class Passfail {
    public static void main(String[] args) {
        /**student should pass in each subject */

        int rollnum;
        int m1, m2, m3;
        float per;
        float total;
        int sumtotal=300;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 1st  subject");
        m1 = sc.nextInt();
        System.out.println("Enter marks of 2nd subject");
        m2 = sc.nextInt();
        System.out.println("Enter marks of 3rd  subject");
        m3 = sc.nextInt();
        total = m1 + m2 + m3;

        per = (total/sumtotal) * 100;
        System.out.println("Total marks obtained: " + total);
        System.out.println(" Percentage is: " + per);
        if (per >= 35) {
            System.out.println("You have Passed");

        }
                else {
            System.out.println("You have Failed");
        }
    }


}
