class Algebra{

    // 1. Member Variable(Class level Scope)
    int a=10; // member variables
    int b=20; // member variables--> they are in the class level scope as they can be accessed anywhere within the class.

    int add(){
        int p=100;
        int q=20;
        return p+q;

        // return a+b;
    }

        int sub()

                // 2.Method Level Scope
        {
           // return p-q; --> can not access p and q outside the method. (method level scope)
            return a-b;

        }

        //3. Block scope

    void demo(){
        int c=10;
        System.out.println(c);
        // System.out.println(d);
        {
            int d=40;
            System.out.println(d);
        }
        {
            int d=400;
            System.out.println(d);
        }

    }

}
public class scopeOfVariable {
    public static void main(String[] args) {
        int a=10;
       // int a=20;  ->>> can not initialize same variable
        Algebra obj =new Algebra();
        obj.demo();


    }
}
