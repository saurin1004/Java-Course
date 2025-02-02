class StringDT {
    public static void main(String args[])
    {
        // String needs to be stored in double quotes

        // String in Jav ais not a primitive datatype. It is a class

        // Usually we create string like this. How it works we will discuss later
        // String name = "Saurin";
       
        // But since String is a class, it can be created as follows as well
        // String name = new String("Saurin");

        // String concatenation can be done by +
        // System.out.println("Hello " + name);

        // We can use '''charAt()'''  method to get chaarcter at specific index in a string
        // System.out.println(name.charAt(1));

        // We can use concat() method to concat 2 strings like + operator
        // System.out.println(name.concat(" Prajapati"));


        // Inside our heap there is a special area called String constant pool
        // So some things to remember:
        // 1. If we ask to create a string called "Saurin" it will check if it already exists in String Constant Pool, if yes then reference to this address is used, else new String object with this value is generated and stored
        // 2. Every string we create in Java is a constant. If we change a variable in which string is stored by concat or append, then that object is eligible for automatic garbage collection, new object gets created, and reference to new object is placed

        // String a = "a";
        // String b = "a";
        // System.out.println(a == b);



        // Concept of mutable (changable) and immutable(unchangable) strings
        // For mutable strings -> String Buffer and String Builder


    }
}