import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("\nEnter Three Number: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if (a>=b && a>=c){
        System.out.println("The number "+a+" is largest");
        }
        else if (b>=a && b>=c){
        System.out.println("The number "+b+" is largest");
        }
        else if (c>=b && c>=a){
        System.out.println("The number "+c+" is largest");
        }
    }
}
