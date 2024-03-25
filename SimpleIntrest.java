import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter principle");
        float p=sc.nextFloat();

        System.out.println("Enter rate");
        float r=sc.nextFloat();

        System.out.println("Enter time");
        float t=sc.nextFloat();

        float SI =(p*r*t)/100;

        System.out.println("SI is: "+SI);
    }
}
