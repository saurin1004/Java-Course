class A {
    A() {
        System.out.println("Object created");
    }
    public void show() {
        System.out.println("in A");
    }
}
public class Demo {
    public static void main(String[] args) {
        int marks;
        marks = 99;

        A obj; // Reference creation step
        obj = new A(); // Object creation step and assignment
        obj.show();
    }
}
