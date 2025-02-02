// Method overriding is simply giving preference to your own method over super class's method

// Method overloading: Same name of method | different datatype of parameters or different number of parameters
// Method overriding: Same name of method | same datatype of parameters 

class A {
    public void show() {
        System.out.println("in A show");
    }
    public void conflict() {
        System.out.println("in A conflict");
    }
}

class B extends A {
    public void conflict() {
        System.out.println("in B conflict");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.conflict();
    }
}
