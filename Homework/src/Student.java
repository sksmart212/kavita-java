import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

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
        /** percentage of subject */
        System.out.println(" Percentage is: " + per);
        if (per >= 80) {
            System.out.println("result is A+ grade");

        } else if (per >= 60 && per < 80) {
            System.out.println("Result Is A grade");
        } else if (per >= 50 && per < 60) {
            System.out.println("Result Is B grade");
        } else if (per >= 35 && per < 50) {
            System.out.println("Result Is C grade & pass");
        } else {
            System.out.println("Result Is Fail");
        }
    }


}
