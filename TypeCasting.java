
// Downcasting and Upcasting concepts

class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        // We can create a parent reference and child object. And also come back to child reference
        
        A obj = (A) new B(); // Upcasting -> happens implictely as well if you write 'A obj = new B();'
        obj.show1();

        B obj1 = (B) obj; // Downcasting -> needs to be done explicitely
        obj1.show2();
    }
}
