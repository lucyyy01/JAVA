import java.util.Scanner;
public class SwapTwoNumber{
    public static void main(String[] args) {
        System.out.println("Swapping two numbers");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=input.nextInt();
        System.out.print("Enter second number: ");
        int b=input.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping ");
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
        input.close();
    }
}