import java.util.Scanner;

public class SumOfwoNumbersT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your first Number");
        int num1=sc.nextInt();

        System.out.println("Enter your Second Number");
        int num2=sc.nextInt();

        int sum=num1 + num2;

        System.out.println("Sum  is: " +sum);

    }
}
