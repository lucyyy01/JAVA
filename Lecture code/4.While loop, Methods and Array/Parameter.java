import java.util.Scanner;
public class Parameter {
    public static void greet(){
    System.out.println("Welcome");
    } 
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int readnum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int a=input.nextInt();
        return a;
    }
   public static void main(String[] args) {
        greet();
        int a=readnum();
        int b=readnum();
 
        System.out.println("Sum: "+sum(a,b));
    }
}
