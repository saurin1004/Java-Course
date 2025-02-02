// We can implement runtime polymorphism using dynamic method dispatch

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // A obj = new B();  So we can mention type as parent and reference as child (Example of computer laptop)

        // Here what matters is not what is the type of object but what the object refers to
        // obj.show();

        A obj = new A();
        obj.show(); // Here what matters is not what is the type of object but what the object refers to

        obj = new B();
        obj.show(); // Here what matters is not what is the type of object but what the object refers to

        obj = new C();
        obj.show(); // Here what matters is not what is the type of object but what the object refers to


    }
}
