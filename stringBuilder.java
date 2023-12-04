import java.util.*;
public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sc = new StringBuilder("hello");
        // System.out.println(sc);
        // // character at index 0
        // System.out.println(sc.charAt(0));
        // // set char at index
        // sc.setCharAt(0,'p');
        // //insert a char
        // sc.insert(2,'n');
        // //delete a char  end index se ek kam delete hota hai
        // sc.delete(2, 3);
        // //append end me char jodna
        // sc.append(" "); // in string str = str  + " " everytime new string , but not in stringbuilder
        // sc.append("S");
        // // length
        
        // reverse the string
        for(int i=0; i<sc.length()/2; i++) {
           int  front = i;
            int back = sc.length() - 1 - i;
            char frontchar = sc.charAt(front);
            char backchar = sc.charAt(back);

            sc.setCharAt(front , backchar);
            sc.setCharAt(back , frontchar);

        }
System.out.println(sc);
    }
}
