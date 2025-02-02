// Useful in arrays and collections

// It returns 1 element of the array at a time until end of array

// Prefer to be called enhanced for loop since in Java 8 there was a for each loop which is different from this enhanced for loop

class ForEachLoop {
    public static void main(String args[])
    {
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 7;
        nums[3] = 1;
        for(int n: nums) {
            System.out.println(n);
        }
    }
}