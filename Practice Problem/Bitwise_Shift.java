import java.util.Scanner;
public class Bitwise_Shift {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Bitwise AND: "+(a&b));
        System.out.println("Bitwise OR: "+(a|b));
        System.out.println("Bitwise XOR: "+(a^b));
        System.out.println("Compliment of "+a+" is "+(~a));
        System.out.println("Compliment of "+b+" is "+(~b));
        System.out.println("Left Shift: "+(a<<b));
        System.out.println("Right Shift: "+(a>>b));
    }
}
