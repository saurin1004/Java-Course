
// Java Tutorial for Beginners by Telusko
// ENDED AT 4:20:57

class Student {
    int rollno;
    String name;
    int marks;
}

class ArrayDataType {
    public static void main(String args[])
    {
        // int nums[] = {4, 5, 6};
        // int nums1[] = new int[4]; // by default all values are 0




        // Multi-dimensional array
        // int nums2[][] = new int[3][4];
        // int random = 0;

        // for(int i=0; i<3; i++) {
        //     for(int j=0; j<4; j++) {
        //         nums2[i][j] = (int)(Math.random()*10);
        //     }
        // }

        // for(int i=0; i<3; i++) {
        //     for(int j=0; j<4; j++) {
        //         System.out.print(nums2[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("#########################");





        // Using an enhanced for loop
        // for(int n[]: nums2) {
        //     for(int m: n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }





        // Jagged array
        // int nums3[][] = new int[3][];
        // nums3[0] = new int[3];
        // nums3[1] = new int[4];
        // nums3[2] = new int[2];

        // for(int i=0; i<nums3.length; i++) {
        //     for(int j=0; j<nums3[i].length; j++) {
        //         nums3[i][j] = (int)(Math.random()*10);
        //     }
        // }

        // for(int n[]: nums3) {
        //     for(int m: n) {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }



        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Saurin";
        s1.marks = 95;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 94;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Pragu";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}

// Drawbacks of array: 
// 1. Once array is defined, cannot change dimensions of the array. So only use if we know that size is fixed.
// 2. Every time we want to search a value it will traverse between the elements.
// 3. Cannot have different datatype values in array

// Collections solves these issues