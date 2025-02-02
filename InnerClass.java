
// We can make inner class static
// But we cannot make outer class static

// class A {
//     int age;
//     public void show() {
//         System.out.println("in show");
//     }
//     static class B {
//         public void config() {
//             System.out.println("in config");
//         }
//     }
// }




// for concept of anonymous inner class
// class A {
//     public void show() {
//         System.out.println("in A show");
//     }
// }

// If we want to change the behaviour of this show() method we can simply create class B and have it extend A, and then write modified show() method
// Ex:
// class B extends A {
//     public void show() {
//         System.out.println("in B show");
//     }
// }




// Concept of abstact class along with anonymous inner class
abstract class A {
        abstract public void show();
    }

public class InnerClass {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // Without static inner class
        // A.B obj1 = obj.new B(); // To use B we need to first instantialize and create an object of A, and then do 'objectName.new B()' to instantialize class B
        
        // After making inner class static
        // A.B obj1 = new A.B(); // Then we can directly call using class
        // obj1.config();




        // Concept of anonymous inner class
        // A obj = new A();

        // A obj = new B(); // and this works - but the only purpose of this class was to modify show() method.
        // If it is being used multiple times at different places then sure we should create it like this

        // BUT, incase it is being used only once, then in that scenario we can do it as follows:
        // A obj = new A() {
        //     public void show() {
        //         System.out.println("in new show"); // This will create an inner class inside current main class which is called anonymous inner class
        //     }
        // };




        // Concept of abstract class along with anonymous inner class 
        // Useful if we want to implement interface or abstract class only once, then we use this approach
        A obj = new A() {
            public void show() {
                System.out.println("in new show 2");
            }
        };
        obj.show();
    }
}
