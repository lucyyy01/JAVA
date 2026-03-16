import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=1;
        while (a<=10){
            System.out.println(a);
            a=a+1;
        }
        a=500;
        while(a>=200){
            System.out.println(a);
            a-=1;
        }
        int i=0;
        while(i<5){
            a=input.nextInt();
            System.out.println("The Number is: "+a);
            i++;
        }
    }
}
