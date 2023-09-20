import java.util.*;
public class Area2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.println("Enter the radius of circle ");
        radius = input.nextInt();
        area = Math.PI * radius * radius;
        System.out.println("the area of the circle is" +area);
    }
}
