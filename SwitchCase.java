import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

        switch (day)
        {
            case  1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THURS");
                break;
            default:
                System.out.println("Invalid Day number");

        }


    }
}
