// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) throws IOException {

        // Option #1 - Limitation : Can only accept 1 character input at a time

        // System.out.println("Enter a number"); // here System is a class, that has 'out' as a static object of PrintStream that is inside of System, and println is a function in PrintStream
        // Similarly we found System.in
        // int num = System.in.read(); // might throw IOException that is a checked exception, henec needs to be handled. 
        // here we are doing something BAD of throws IOException to JVM, which should not be done in Production of applications
        
        // Now this num is actually stored as an integer representation of ASCII, and only stores 1 character
        // System.out.println(num - 48);




        // Option #2 - Limitation: Veeeery lengthly approach - But still can be used even for different input sources apart from keyboard, like a file - so yeah...

        // To take multiple character input we need to use BufferedReader

        // InputStreamReader in = new InputStreamReader(System.in); // Since BufferedReader takes Reader class object as input we are creating InputStreamReader object which we will pass to BufferedReader
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();



        // Option #3 - Most used apporach - introduced in version 1.5 - Looots of methods - do explore 'sc.____()'

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
