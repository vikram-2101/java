public class recurrsion {
    // public static void printnum(int n) {
        // print num from  5 to 1
    //     if (n==0) { // Back case
    //         return;
    //     }
    //     System.out.println(n);//print outer function first
    //     printnum(n-1);  // print inner function 
    // }
    // public static void main(String args[]) {
       
    //     int n=5;
    //      printnum(n);  // call function

     
    //print num from 1 to 5
    // if (n==6) {
    //     return;
    // }
    // System.out.println(n);
    // printnum(n+1);
    // } 
    // public static void main(String args[]) {
    //     int n=1;
    //     printnum(n); 

    // print sum of n numbers

// public static void printsum(int i, int n, int sum) {
//     if(i == n) {
//         sum+=i;
//         System.out.println(sum);
//         return;
//     }
//     sum+=i;
//     printsum(i+1, n, sum);
// }
// public static void main(String args[]) {
//     printsum(1, 5, 0);


// print factorial

// public static int calcFactorial(int n) {
//  if( n==0 || n==1) {
//     return 1;
//  }
//  int n1 = calcFactorial(n-1);
//  int n2 = n * n1;
//  return n2;
// }
// public static void main(String args[]) {
//  int n =5;
// int ans = calcFactorial(n);
// System.out.println(ans);


// Fibonacci sequence 
// public static void printFb(int a, int b, int n) {
//     if(n==0) {
//         return;
//     }
//     int c = a + b;
//   System.out.println(c);
//   printFb(b, c, n-1);
// }
// public static void main(String args[]) {
//     int a = 0;
//     int b=1 ;
//     System.out.println(a);
//     System.out.println(b);
//     int n = 7;
//     printFb(a, b, n-2);

 // Print x^n stack height n
//  public static int calcPower(int x, int n) {
// if (n==0) {
//     return 1;
// }
// if(x==0) {
//     return 0;
// }
// int n1= calcPower(x, n-1);
// int n2 = n1 * x;
// return n2;
//  }
//  public static void main(String args[]) {
//     int x=2, n=5;
//     int ans=calcPower(x, n);
//     System.out.println(ans);
 
// Print x^n stack height logn 
 public static int calcPower(int x, int n) {
if (n==0) { // base case 1
    return 1;
}
if(x==0) {  // base case 2
    return 0;
}
if(n%2==0) { // n is ever 
    return calcPower(x, n/2) * calcPower(x, n/2);
}
else{ // n is odd
return calcPower(x, n/2) * calcPower(x, n/2) * x;
}
 }
 public static void main(String args[]) {
    int x=2, n=5;
    int ans=calcPower(x, n);
    System.out.println(ans);
}
}