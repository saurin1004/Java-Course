// Whenever we have an abstract class with ONLY abstract methods, there is another way to implement it
// Alternative is to create an interface

// Once class can implement multiple interfaces

interface A {
    int age = 22; //All variables in interface are final and static
    String area = "Tempe, AZ";
    void show(); // by default all methods in interface
    void config();
}

interface X {
    void run();
}

interface Y extends X{ // interface can extend interface
    
}

class B implements A, Y {
    public void show() {
        System.out.println("in B show");   
    }

    public void config() {
        System.out.println("in B config");
    }

    public void run() {
        System.out.println("in B run");
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
    }
}

// class -> class : extends
// interface -> class : implements
// interface -> interface : extends