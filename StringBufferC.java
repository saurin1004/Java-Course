class StringBufferC {
    public static void main(String args[])
    {
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity()); // Empty still will keep buffer of 16, so capacity will print 16

        // StringBuffer keeps a buffer of 16 so that incase it is changed in future, the change does not cause the size to exceed existing size by 16, so that new object creation and reassignment is avoided
        StringBuffer sb = new StringBuffer("saurin");
        System.out.println(sb.capacity());

        // Length and capacity are 2 different things, length will return length of value stored in StringBuffer object
        System.out.println(sb.length());

        // We can use toString() method to convert StringBuffer to String object
        String obj = sb.toString();

        // Lots of methods like deleteCharAt(), insert(), ensureCapacity(), setLength(), and so on...


        // NOTE: StringBuffer is thread safe, and StringBuilder is NOT
    }
}