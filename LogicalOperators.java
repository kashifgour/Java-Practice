public class LogicalOperators {
    public static void main(String[] args) {
        int p=15, q=10, r=5;

        // && Operator
        System.out.println((p>q)&&(p>r)); //true
        System.out.println((p>q)&&(p<r)); // false
        System.out.println((p>q)&&(p<r)); // false

        // || Operator
        System.out.println((r>q)||(p<r)); //True
        System.out.println((p>q)||(p<r)); //True
        System.out.println((p>q)||(p>r)); //True
        System.out.println((p<q)||(p<r)); // False
        System.out.println((p>q)&&(p<r));

        // ! Operator
        System.out.println(!(p==q)); // true
        System.out.println(!(p>q)); //False
    }
}
