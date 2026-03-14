import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Calculate Simple Interest");
        System.out.print("\nEnter Princpal amount: ");
        int p=input.nextInt();
        System.out.print("Enter Rate: ");
        float r=input.nextFloat();
        System.out.print("Enter Time in Year: ");
        int t=input.nextInt();
        double si=(p*r*t)/100;
        System.out.print("The Simple Interest is "+si);
    }
}