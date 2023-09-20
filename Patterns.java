import java.util.*;
public class Patterns {
    public static void main(String args[]) {
        int n=5;
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //     for(int j=1; j<=5; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    } 

    // SOLID RHOMBUS


        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //    for(int j=1; j<=i; j++) {
        //     System.out.print(i + " ");
        //    } 
        //    System.out.println();
        // }

        //  PYRAMID


        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.println("");
            }
           for(int j=1; j<=i; j++) {
            System.out.print(j);
           }                     
        }
        System.out.println();
    }

}