import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Calculate Simple Interest");
        System.out.print("\nEnter Princpal amount: ");
        int p=input.nextInt();
        System.out.print("Enter Rate: ");
        float r=input.nextFloat();
        System.out.print("Enter Time in Year: ");
        int t=input.nextInt();
        double ci=p*Math.pow((1+r/100), t);
        System.out.print("The Compound Interest is: "+ci);
    }
}
