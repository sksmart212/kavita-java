import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        /**for swapping value of two integers we have to take third number which is temperory int*/
        System.out.println("Enter value");
        a = sc.nextInt();
        System.out.println("Enter another value");
        b = sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Value of  a swapped to b " + a);
        System.out.println("Value of b swapped to a "+ b);


    }
}
