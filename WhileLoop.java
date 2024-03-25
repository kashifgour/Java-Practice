import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int  num=1;
        // Sum of n numbers
        int sum=0;

        while(num<=n){
           // System.out.println(num);

            sum=sum+num;
            num++; // Increment operator
        }
        System.out.println(sum);

    }
}
