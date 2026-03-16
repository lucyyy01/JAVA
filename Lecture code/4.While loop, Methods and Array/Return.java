import java.util.Scanner;
public class Return {
    public static void greet(){
        System.out.println("Welcome to calculator");
    }
    public static int myNum(){
        System.out.print("Please enter any number: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        return a;
    }
    public static void main(String[] args) {
        greet();
        int a=myNum();
        int b=myNum();
        int sum=a+b;
        System.out.print("Sum: "+sum);
    }
}
