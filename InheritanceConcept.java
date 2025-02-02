class A  extends Object {
    public A() {
        super();
        System.out.println("In A");
    }
    public A(int a) {
        super();
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("In B");
    }
    public B(int a) {
        this();
        System.out.println( "In B int");
    }
}

// Whenever we create an object, it will call the constructor of given class and superclass both

// By default in every constructor super() is there

// if we want to invoke a parameterized superclass then we need to explicitely call parameterized super method 

// Every class in Java extends Object class

// this() method will invoke constructor for current class




public class InheritanceConcept {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
