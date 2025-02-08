import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
                    return 1;
                return -1;
    }
    
    
}

// Comparator - if you want to specify on which logic your collection sorts, then use comparator

// Comparable - if you want to give your class sorting capabilities, use 'implements Comparable', and then add logic for comparision in 'compareTo()' method

public class SortingCollections {
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if(i%10 > j%10)
        //             return 1;
        //         return -1;
        //     }
        // };

        Comparator<Student> com = (Student i, Student j) -> i.age>j.age?1:-1;

        // List<Integer> nums = new ArrayList<>();
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Ram"));
        studs.add(new Student(25, "Kal"));
        studs.add(new Student(23, "Pam"));
        studs.add(new Student(29, "Sun"));
        // nums.add(43);
        // nums.add(15);
        // nums.add(59);

        // Collections.sort(nums, com);

        // Collections.sort(studs, com);
        Collections.sort(studs);

        for(Student s: studs) {
            System.out.println(s);
        }

        // System.out.println(studs);
    }
}
