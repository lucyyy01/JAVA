import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Discount Calculator");
        System.out.print("Enter Your Age: ");
        int age=input.nextInt();
        System.out.print("Are you a Female? (true/False) ");
        boolean isFemale=input.nextBoolean();
        if (age<=5){
            System.out.println("You get 75% Discount");
        }
        else if(isFemale){
            System.out.println("You get 50% Discount");
        }
        else if(isFemale && age>60){
            System.out.println("You get 25% Discount");
        } 
        else{
            System.out.println("You do not get any Discount");
        }
    }
}
