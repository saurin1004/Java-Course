
class SapException extends Exception {
    public SapException() {
        super();
    }
    public SapException(String s) {
        super(s);
    }
}

public class ThrowException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try {
            j = 18/i;
            if(j == 0)
                throw new SapException("I don't want to print 0");
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("That's the default output | " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong. " + e);
        }
        System.out.println(j);

    }
}
