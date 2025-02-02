// They are interfaces that have only 1 method

// @FunctionalInterface
// interface A {
//     void show(int i);
// }
// class B implements A {

//     @Override
//     public void show() {
//         System.out.println();
        
//     }
    
// }

interface A {
    int add(int i, int j);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // A obj = new A() {
        //     public void show() {
        //         System.out.println("in show");
        //     }
        // }; 


        // A obj = (int i) ->
        // {
        //     System.out.println("in show " + i);
        // }; 
        // obj.show(4);

        // A obj = new A() {
        //     public int add(int i, int j) {
        //         return i+j;
        //     }
        // };
        // Can be written as follows using lambda expression:
        A obj = (i, j) ->  i+j; 

        // NOTE: lambda expression only works with a functional interface

        System.out.println(obj.add(3, 4));

    }
}
