public class reverse {
     public static int main(String[] args) {
       return find(-123);
        
     }
     static int find(int n) {
        if(n> Integer.MAX_VALUE || n< Integer.MIN_VALUE)  return 0;
        int sum =0;
       
         while(n!=0) {
            int rem= n%10;
            sum = sum*10+rem;
            n=n/10;
         }
         return sum;
     }
}
