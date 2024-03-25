import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Taking input as a String
       /* System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Name is: "+name); */

        // For nextLine
        System.out.println("Enter your name");
        String name1=sc.nextLine();
        System.out.println("Name is: "+name1);



        // Taking input as an integer
        System.out.println("Enter your number");
        int num1=sc.nextInt();
        System.out.println("Number is: "+num1);

    }
}
