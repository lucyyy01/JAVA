import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        greet();
        int a=readName()+1;
        int b=readName()+1;
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    public static void greet(){
        System.out.println("Welcome");
    }
    public static int readName(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a=input.nextInt();
        return a;
    }
}
