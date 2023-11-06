import java.util.*;
public class HappyNumber {
  public static void main(String[] args) {
    int n=19;
   // System.out.println(isValid(n));
    int[] arr = {2,2,1,1,1,2,2};
    majority(arr);
    System.out.println(Arrays.toString(majority(arr);));
  }   
  static boolean isValid(int n) {
    if(n<1) return false;
       while(n>=1) {
        int sum = 0;
        int rem = n%10;
        sum += rem*rem;

        n/=10;
       if(sum==1) return true;
       }
       return false;
  }
  static void majority(int[] arr ) {
    int n = arr.length;
    int count = 0;
    int i ;
    for(  i=0; i<arr.length; i++ ) {
      for(int j=i+1; j<arr.length-i-1; j++) {
         if(arr[i]==arr[j]) {
          count++;
         }
      }
    }
    if(count>n/2) {
      System.out.println(arr[i]);
    }
  }
    
    
}
