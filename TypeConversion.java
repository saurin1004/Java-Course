// We can put a small item in a bigger box but not a bigger item in smaller box
// So implicility, there might be errors when converting from larger data type to smaller data type in Java
// This can be achieved explicitly using typecasting

class TypeConversion {
    public static void main(String args[])
    {
        float f = 127.12f;
        int i = 257;
        byte b = 127;

        // Explicit type conversion examples

        b = (byte)i; // It will do modulo of value in i by 127 if it exceeds value range.
        i = (int)f;
        System.out.println(b);
        System.out.println(i);

        // Type promotion concept

        byte b1 = 10;
        byte b2 = 20;

        int result = b1 * b2;

        System.out.println(result);

    }
}
