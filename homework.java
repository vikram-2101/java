import java.util.*;
public class homework {
    // public static int multiply(int a, int b) {
    //  return a*b;
    // }
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int result=multiply(a,b);
    //     System.out.println(result);
    // }


    // public static void printFactorial(int n) {
    //   if( n<0) {
    //     System.out.println("Invalid number");
    //     return;
    //   }
    //   int factorial=1;
    //   for(int i=n; i>1; i--) {
    //     factorial=factorial*i;
       
    //   }
    //   System.out.println(factorial);
    // }
    // public static void main(String args[]) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     printFactorial(n);
    // }


   
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
        if(n%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("not Even");
        }
       
    }
}
