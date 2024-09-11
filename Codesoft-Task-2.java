import java.util.Scanner;
public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte Physics , Chemistry , Mathematics , Biology;

        System.out.println("Enter your physics marks:");
        Physics= sc.nextByte();
        System.out.println("Enter your chemistry marks:");
        Chemistry= sc.nextByte();
        System.out.println("Enter your Mathematics marks:");
        Mathematics= sc.nextByte();
        System.out.println("Enter your Biology marks:");
        Biology= sc.nextByte();
        
        int Total = Physics + Chemistry + Mathematics + Biology ;

        System.out.println("Your total marks is:"+Total);

        float avg =  Total / 4f ;
        System.out.println("Your percentage is:"+avg);

        if (avg>=90)
        {
            System.out.println("A");
        }
        else if ( avg>=80){
            System.out.println("B");
        }
        else if ( avg>=70){
            System.out.println("C");
        }
        else if(avg>=60) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
    }
}
