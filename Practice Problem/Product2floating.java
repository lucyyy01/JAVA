import java.util.Scanner;
public class Product2floating {
    public static void main(String[] args) {
        Scanner output=new Scanner(System.in);
        System.out.print("\nEnter A: ");
        float a=output.nextFloat();
        System.out.print("Enter B: ");
        float b=output.nextFloat();
        float product=a*b;
        System.out.println("Product of A and B is: "+product);
    }
}
