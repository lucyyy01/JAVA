import java.util.Scanner;
public class Factorial {
    public static void f(int n){
        int i=1;
        int t=1;
        if(n==0){
            System.out.println("The Factorial is Zero");
        }
        else if(n<0){
            System.out.println("Enter valid number");
        }
        else{
            while(i<=n){
                t*=i;
                i++;
            }
            System.out.println("The Factorial of "+n+" is: "+t);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to factorial calculator");
        System.out.println("Enter any number");
        int n=input.nextInt();
        f(n);
    }
}
