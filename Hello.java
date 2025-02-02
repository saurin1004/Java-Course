// NOTE: usually we first do '''javac filename.java''' followed by '''java classname'''

// In versions post JDK 14, incase filename is same as classname, 
// we can directly compile and run it using command '''java filename.java'''

class Hello
{
    public static void main(String a[])
    {
        // literals

        int num1 = 10;
        byte by = 126;
        short sh = 558;
        long l = 5854l;

        float f = 10.4f;
        double d = 10.4;

        char c = 'a';

        boolean b = true;



    }
}
// Data
// A. Primitive
//     1. Integer -> byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes)
//     2. Float -> double (8 bytes), float (4 bytes)
//     3. Character -> char (2 bytes - follows UNICODE)
//     4. Boolean -> boolean (1 byte - true or false)

