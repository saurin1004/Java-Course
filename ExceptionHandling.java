// Error:
//     - Compile-time Error (syntax related errors)
//     - Runtime Error
//     - Logical Error

// Statement - normal & critical

// NOTE: Most of the names that end with 'able' are usually interfaces (apart froom Throwble which is parent class of Exception which is parent class of RuntimeException)

// Throwable
    // - Error (Ex: ThreadDeath, IOError, VirtualMachineError, OutOfMemoryError, etc) - cannot be handled by code
    // - Exception (Ex: RuntimeException, SQLException, IOException, etc)
    //      - RuntimeException (Ex: Arithmetic, ArrayIndexOutOfBounds, NullPoint) - they are called unchecked exceptions - we have choice if we want to handle them or not
    //      - SQLException, IOException - they are called checked exceptions - when compiler sees line that can raise exceptions other than runtime exception, then it will ask you compulsory to handle that exception

public class ExceptionHandling {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        String str = null;

        int nums[] = new int[4];
        
        try {
            j = 18/i;
            System.out.println(nums[1]);
            // System.out.println(nums[6]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero. " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is outside of bounds. " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong. " + e);
        }
        System.out.println(j);

        System.out.println("bye");
        
    }
}
