import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        /**calculation of employee gross salary =hra + ta + da + b - pf */
        int hra,da,pf,ta,b,g;
        String employeeid,employeename;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        employeeid=sc.next();
        System.out.println("Enter employee name");
        employeename=sc.next();
        System.out.println("Enter basic salary");
        b= sc.nextInt();
        hra = b *10/100;
        da = b*8/100;
        ta =b*9/100;
        pf =b*20/100;
        g =b+da+ta+hra-pf;
        System.out.println("Gross salary is " + g);

    }


}
