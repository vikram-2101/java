import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class h {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("================================");
    //     for(int i=0;i<3;i++){
    //         String s1=sc.next();
    //         int x=sc.nextInt();
    //         //Complete this line
    //       System.out.printf("5-15s%03d\n" ,s1, x);

    //     }
    //     System.out.println("================================");



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i=1; i<=10; i++ ) {
            System.out.println(N+" x "+ i +" = "+N*i);
        }
    }
}

//     }
// }

