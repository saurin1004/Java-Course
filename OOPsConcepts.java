// Object Oriented Programming
// Object - Properties and Behaviours

// Class - blueprint of object
// JVM creates object using class

// class Calculator {
//     int a;
//     int b;

//     public int add(int a, int b) {
//         return a+b;
//     }
// }

// class Computer {
//     public void playMusic()
//     {
//         System.out.println("Playing music...");
//     }

//     public String getMeAPen(double money)
//     {
//         if(money > 10)
//             return "Here is your pen :)";
//         return "Insufficient money :(";
//     }
// }

class Calculator {
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3) // Method overloading -> in it return type does not matter, what matters is the name and the datatype of parameters
    {
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2)
    {
        return n1 + n2;
    }


}

class OOPsConcepts {
    public static void main(String args[])
    {
        // int num1 = 5;
        // int num2 = 6;
        // Calculator c = new Calculator();
        // System.out.println(c.add(num1, num2));

        


        // Computer obj = new Computer();
        // obj.playMusic();
        // System.out.println(obj.getMeAPen(2.00));




        // Calculator obj = new Calculator();
        // System.out.println(obj.add(1, 2, 3));

        




    }
}

// JVM has stack and heap memory

// Every method has its own memory stack inside JVM

// Objects get created inside the heap memory (composed of 2 things: all the instance variables, since local variables are part of stack & methods)

// Main stack will contain the heap address for the object corresponding to it (think of it as a link)