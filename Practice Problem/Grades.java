import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        float marks=input.nextFloat();
        double percentage=(marks/100)*100;
        if (percentage>90){
            System.out.println("A Grade");
        }
        else if (percentage>75){
            System.out.println("B Grade");
        }
        else if (percentage>60){
            System.out.println("C Grade");
        }
        else if (percentage>30){
            System.out.println("D Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }
}
