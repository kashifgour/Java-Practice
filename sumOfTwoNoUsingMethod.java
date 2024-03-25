import java.util.Scanner;
// user defined method
class Algebra{
    int add(int a, int b){
        int ans= a+b;
        return ans;
    }
}



public class sumOfTwoNoUsingMethod {
    public static void main(String[] args) {
        Algebra obj=new Algebra();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Sum of two Numbers is: ");
        int ans=obj.add(a,b);
        System.out.println(ans);

       // obj.add(5,7);

    }


}
