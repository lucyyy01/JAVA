import java.util.Scanner;
public class OddSum {
    public static int oddNumSum(int n){
        int i=0;
        int sum=0;
        while(i<=n){
            if(i%2==0);
            else{
                sum+=i;
            }
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to sum of odd number: ");
        System.out.print("Enter any number: ");
        int n=input.nextInt();
        System.out.println("The Sum is: "+oddNumSum(n));
    }
}
