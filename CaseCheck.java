import java.util.*; b

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println("Lower case");
        } else {
            System.out.println("Upper Case");
        }

    }
}
