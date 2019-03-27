import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales amount");
        /**commission =sales amount*%*/
        double commission;
        double percent;
        int s = sc.nextInt();
       if (s >= 50000)
       {
           percent=35;
           commission=(percent / 100) * s ;
        System.out.println("Your commission is:  " +  commission);}
        else if (s >= 30000)
        {
            percent=20;
            commission=(percent / 100) * s ;
            System.out.println("Your commission is: " +  commission);}
        else if (s >= 20000)
        {
            percent=10;
            commission=(percent / 100) * s ;
            System.out.println("Your commission is: " + commission);}
        else if (s >= 10000)
        {
            percent=5;
            commission=(percent / 100) * s ;
            System.out.println("Your commission is: " + commission);}
        else if(s< 10000 )
        {
            percent=2;
            commission=(percent / 100) * s ;
            System.out.println("Your commission is: " + commission);}

    }
}
