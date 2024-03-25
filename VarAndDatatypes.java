public class VarAndDatatypes {

    /* Class--> a user defined blueprint consisting of attributes and methods.

      Ex- Car--> attriutes(company, color, price).
      methods, functions--> run(), openwindow().

      objects--> BMW, Audi,Mercedes.(instance of the class).
      Accessing methods--> audi.color(),BMW.openwindow().*/

    public static void main(String[] args) {
        /* functions--> a block of code that can be call anywhere in the program.
         function name--> addTwoNumbers(int x, int y)
         int--> return type value.
         int x, int y--> parameters of function.

         main--> It is a function name , It is always named as main( entry point in java program).
         void--> it return nothing.

         public--> access modifier--> makes the main function public (this class is everywhere visible any one can see it and use it).
         static--> allows to call this method without creating an object of the class.
         String [] args--> command line arguments. (string kin list hai with multiple values).
         []--> List
         args- standard name it can be written with another name also.*/



        System.out.println("Hello World -Physics Wallah");
        /* 1.System--> It is a class. It provides a standard input/output and error streams.
         2.out--> out is the object of printstream class.
         3.println--> method in printstream class accessing it through out object of printstream class. */


        /* Java Variables--> titles of reserved memory location.
          -->Syntax of Declaring a Java Variable-->
           Type Variable_name[=value];
           int money=1000;
           String name="kashif"
            */
        int money=1000;
        System.out.println(money);
         money=5000;
        System.out.println(money);

        /*
        --> Java Naming Convention-->
        1. Lowercase-collegewallah (packages are written)
        2. Uppercase-COLLEGEWALLAH
        3.Camelcase--> collegeWallah (functions and variable should be written in camleCase).
        4. PascalCase--> Class.
        5. Upper Snakecase--> constant.(college_wallah,MIN_CAPACITY)
         */
        /*
          --> Identifiers in Java-->
          Name given to a package, class, interface, method, or variable.
          Rules--> $,_, A toZ, my@name are allowed.
                  > reserved word and white space not allowed.
            ex--> _money,$money
            */

        /*
        --> java data types-->
        1. primitive
        -- built in data type in java, they hold single values.
        -- can not be divided
        2.Non-primitive.
        -- user defined data type, hold memory address of variables.
        -- can be divided.


         */











    }
}
