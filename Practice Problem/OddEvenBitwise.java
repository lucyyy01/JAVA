import java.util.Scanner;
public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=input.nextInt();
        if ((n&1)==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}

