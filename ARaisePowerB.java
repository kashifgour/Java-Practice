import java.util.Scanner;

public class ARaisePowerB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        int ans=1;
        for(int i=1;i<=5;i++)
        {
            ans=ans*a;

        }
        System.out.println(ans);




    }
}
