import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numOfDigits=0;
        int original_num=num;

        while(num>0) {

            num = num / 10;
            numOfDigits++;
        }

        System.out.println("Number OF Digits in "+ original_num + " = "+numOfDigits);


    }

}
