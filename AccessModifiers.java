// public - can be accessed anywhere (same class, same package subclass, same package non-subclass, different package subclass, different package non-subclass)
// private - can be used in the same class
// default (also called private protected) - can be accessed in the same package (same class, same package subclass, same package non-subclass)
// protected - cannot be used outside of package except for subclass (same class, same package subclass, same package non-subclass, different package subclass)

// We cannot have 2 public classes in same file

// Try to keep your classes public - usually we keep 1 class per file
// Try to keep your instance variables private
// Methods will be public most of the times. But if you think a method should only be accessible by subclass of other packages then keep it protected
// Avoid default

import other.*;

public class AccessModifiers {
    public static void main(String[] args) {
        
        // A obj = new A();
        // System.out.println(obj.marks);

        // B obj1 = new B();
        // System.out.println(obj1.marks);
    }
}
