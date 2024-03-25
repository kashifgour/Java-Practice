import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();

       /* if(value % 2==0 && value % 3==0){
            System.out.println("Found Answer "+ value);
        }*/

        // Divisible by 3 or 5
        if(value % 3==0 || value % 5==0)
        {
            System.out.println("Found Answer: "+value);
        }
    }
}
