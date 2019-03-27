import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        /**year is leap year */
        int year;
        System.out.println("Enter year");
        Scanner inyear = new Scanner(System.in);
        year = inyear.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
        System.out.println("Year is leap year");
        }
        else {
         System.out.println("Year is not leap year");
        }


    }
}
