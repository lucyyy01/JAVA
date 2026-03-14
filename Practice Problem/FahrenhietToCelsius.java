import java.util.Scanner;
public class FahrenhietToCelsius {
    public static void main(String[] args) {
        System.out.println("Convert Fahrenhiet to Celsius");
        Scanner i=new Scanner(System.in);
        System.out.print("\nEnter Degree in Fahrenhiet: ");
        float f=i.nextFloat();
        double c=(f-32)*5/9;
        System.out.print("Degree Celsius: "+c);
    }
}
