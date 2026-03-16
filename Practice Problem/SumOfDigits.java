import java.util.Scanner;
public class SumOfDigits {
    public static int sum(int n){
        int i=0;
        int s=0;
        while(n!=0){
            i=n%10;
            n=n/10;
            s+=i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("Welcome to digit calculator of any number");
        int n=input.nextInt();
        System.out.println("The digit sum of "+n+" is: "+sum(n));
    }
}
