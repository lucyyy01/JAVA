import java.util.Scanner;
public class Input{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Good morning "+name);
        System.out.print(name+", Also enter your age: ");
        int age=input.nextInt();
        System.out.print("Your age is: "+age);
    }
}