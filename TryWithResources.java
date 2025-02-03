
// finally help whenever you want to execute that piece of code regardless of exception happening or not

// Mostly it is useful when we want to close a resource

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;

        // Regular usage

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try {
        //     System.out.println("Enter number");
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println("Number is " + num);
        // }
        // finally {
        //     br.close();
        // }



        // Optimised new approach
        // If we enter BufferedReader or any other resource user like Scanner inside round brackets after try, they will be autoclosed when try block ends
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter number");
            num = Integer.parseInt(br.readLine());
            System.out.println("Number is " + num);
        }
    }
}
