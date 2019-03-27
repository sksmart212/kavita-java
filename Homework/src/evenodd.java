import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        /** for even no = a % 2 == 0)  number which is divisible by 2 and remainder is o */
        int a;
        a= sc.nextInt();
        if( a % 2 == 0)
             System.out.println(a +  " is even");
        else
            System.out.println(a + " is odd");






    }
}
