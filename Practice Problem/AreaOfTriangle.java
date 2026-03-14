import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter Base of Triangle: ");
        float base=input.nextFloat();
        System.out.print("Enter Height of Triangle: ");
        float height=input.nextFloat();
        double area=0.5*base*height;
        System.out.print("The Area of Triangle is "+area);
    }
}
