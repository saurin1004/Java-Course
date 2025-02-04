import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollections {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(21);
        nums.add(43);
        nums.add(15);
        nums.add(59);

        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
