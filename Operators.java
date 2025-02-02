class Operators {
    public static void main(String args[])
    {
        // Arithmetic operators like: +, -, *, /, %

        // int num1 = 7;
        // num1 = num1 * 2;

        // Shortcut
        // num1 *= 2;;

        // num1++; //post incement
        // ++num1; //pre increment
        // num1--;

        // int result = num1++; // First fetch the value of num1 and then increment num1
        // int result = ++num1; // First increment the value of num1 and then fetch the value

        // System.out.println(result);




        // Relational operators: <, >, >=, <=, ==, != and they return boolean datatype output

        // int x = 4;
        // int y = 5;

        // boolean result = x < y;
        // System.out.println(result);



        // Logical operators: &&, ||, ! (These are called short-circuit. The reason is the checking of second condition depends on result of first condition)

        int n1 = 4;
        int n2 = 5;

        boolean result = !(n1 < n2 && n1 > 2);
        System.out.println(result);
        
    }
}