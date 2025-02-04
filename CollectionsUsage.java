// So basically there are 3 different things:

//     - collection API - which is about a concept
//     - Collection - which refers to an interface
//     - Collections - which referes to a class

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsUsage {
    public static void main(String[] args) {

        // Collection API works with objects, so we need to manually mention what datatype wil constitute the collection
        // Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(313);
        nums.add(2);
        nums.add(1);

        Iterator<Integer> values = nums.iterator();
        
        while(values.hasNext()) {
            System.out.println(values.next());
        }

        // System.out.println(nums);

        // for(int n: nums) 
        //     System.out.println(n);

        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(6));
    }
}
