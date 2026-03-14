import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter Length: ");
        float length=input.nextFloat();
        System.out.print("Enter Width: ");
        float width=input.nextFloat();
        float perimeter=2*(length+width);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
    }
}