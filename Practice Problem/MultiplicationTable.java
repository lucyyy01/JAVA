import java.util.Scanner;
public class MultiplicationTable {
    public static void table(int n){
        int i=1;
        while(i<=10){
            System.out.println(n+" X "+i+" = "+n*i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table maker");
        System.out.print("Enter any number: ");
        int a=input.nextInt();
        table(a);
    }
}
