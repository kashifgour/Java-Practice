import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumOfDigits = 0;
        int original_n = num;
        while (num>0) {
            sumOfDigits += num % 10;
            num = num / 10;
        }
        System.out.println("Sum Of Digit "+ original_n+" = "+sumOfDigits);
    }
}