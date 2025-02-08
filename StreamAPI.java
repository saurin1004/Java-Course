import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
// import java.util.function.Consumer;
import java.util.stream.Stream;


// Stream was intrduced in Java 1.8

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1, 2, 3, 4);

        // Understanding forEach()
        // Different ways to print values in a List

        // Mtd #1
        // System.out.println(nums);

        // Mtd #2
        // for(int i=0; i<nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }

        // Mtd #3
        // for(int n: nums) {
        //     System.out.println(n);
        // }

        // Mtd #4: using Consumer
        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // nums.forEach(con);

        //Mtd #5: making Consumer - shorter
        // Consumer<Integer> con = n -> System.out.println(n);

        // nums.forEach(con);

        // Mtd #6: We can directly use con
        // nums.forEach(n ->System.out.println(n));





        // Understanding StreamAPI
        // int sum = 0;
        // for(int n: nums) {
        //     if(n%2 == 0)
        //         n = n*2;
        //         sum += n;
        // }


        // We can perform any operation using stream, adn it will not affect nums
        // Once you use stream, you can't reuse it
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);
        // s3.forEach(n ->System.out.println(n));


        // Predicate<Integer> p = n -> n%2 == 0;
        
        

        // int result = nums.stream()
        //     .filter(n -> n%2 == 0)
        //     .map(n -> n*2)
        //     .reduce(0, (c,e) -> c+e);

        // int result = nums.stream()
        //     .filter(p)
        //     .map(n -> n*2)
        //     .reduce(0, (c,e) -> c+e);
        // System.out.println(result);

        Stream<Integer> s = nums.stream()
            .filter(n -> n%2 == 0)
            .map(n -> n*2)
            .sorted();
            
        s.forEach(n -> System.out.println(n));

        // If we want to use multiple threads for filtering we can use nums.parallelStream() instead of nums.strem().
        // But it cannot be used along with .sorted() since .sorted() needs all the elements to be present.

    }
}
