import java.util.Scanner;

public class Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days of week");
        /** days of week*/
        int d;
        d= sc.nextInt();
        if(d== 1)
        {
             System.out.println("You entered Monday");
        }
        else if(d== 2)
        { System.out.println("You entered Tuesday");}
          else  if(d== 3)
        { System.out.println("You entered Wednesday");}
          else  if(d== 4)
        { System.out.println("You entered Thursday");}
          else  if(d== 5)
        { System.out.println("You entered Friday");}
          else  if(d== 6)
        { System.out.println("You entered Saturday");}
        else if(d== 7)

        { System.out.println("You entered Sunday which is fun day");}
          else
        { System.out.println("invalid entry");}





    }
}
