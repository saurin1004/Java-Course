// Discussion of the concept of 'is'

// Java supports Single-level and Multi-level inheritance, but it does not support multiple inheritance (to avoid ambiguity)

import other.tools.*;

public class Inheritance2 {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2, 4);
        int r2 = obj.sub(3, 1);
        int r3 = obj.mul(2, 4);
        int r4 = obj.div(6, 2);
        int r5 = obj.pow(6, 2);
        System.out.println(r1 + " " + r2 +  " " + r3 + " " + r4 + " " + r5);
        
    }
}
