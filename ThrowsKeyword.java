// Different from throw Exception concept

// throws exception on a method concept ducks the responsibility of handling the exception

// This is very important in checked exceptions like IOException or DatabaseException

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Sirrrrr");
    }
}

public class ThrowsKeyword {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
