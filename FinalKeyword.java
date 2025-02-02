// Final - variable, method, class

// final variable - cannot be changed later. So whenever you have a variable you think will not change try to make it final so that you get an unexpected error incase it is being tried to change 

// final class - cannot be extended - that is cannot be inherited

// final method - cannot override method

// final class Calc {
//     public void show() {
//         System.out.println("by SP");
//     }
//     public void add(int a, int b) {
//         System.out.println((a+b));
//     }
// }

// class AdvCalc extends Calc{

// }

class Calc {
    final public void show() {
        System.out.println("by Saurin");
    }
    public void add(int a, int b) {
        System.out.println((a+b));
    }
}

class AdvCalc extends Calc {
    // public void show() {
    //     System.out.println("by Dev");
    // }
    public void add(int a, int b) {
        System.out.println((a+b));
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // final int num = 8;
        // num = 9;
        // System.out.println(num);




        // Calc obj = new Calc();
        // obj.show();
        // obj.add(4, 5);




    }
}
