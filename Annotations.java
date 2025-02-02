
// In core java we do not usually use annotations - useful, but not madatory

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}
class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
