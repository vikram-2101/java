import java.util.*;
public class MakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1 , number2;
        char operator;
        System.out.println("enter first number");
         number1=input.nextFloat();
         System.out.println("enter operator");
         operator=input.next().charAt(0);
         System.out.println("enter second number");
         number2=input.nextFloat();
         if(operator=='+') {
            float sum = number1 + number2;
            System.out.println("sum "+sum);
         
         }
         if(operator=='-') {
            float sub = number1 - number2;
            System.out.println("sub "+sub);
         }
           if(operator=='*') {
            float mult = number1 * number2;
            System.out.println("mult "+mult);
           }
         if(operator=='%') {
            float div = number1 % number2;
            if(number2==0)
           {
             System.out.println("Error");
           }
            else{
                System.out.println("div "+div);
            }
         }
    }
    
}
