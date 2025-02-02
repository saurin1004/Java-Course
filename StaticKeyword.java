class Mobile {
    String brand;
    int price;
    String name;
    static String deviceType; // Since we have made it static it si shared by all devices

    static {
        deviceType = "Phone"; // Static block is called only ONCE. It will be called first
        // Reason, First class loads and then object gets insitialized. sSo when class loading happen, at that time static block gets executed
        System.out.println("Inside static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        name = "";
        System.out.println("Inside constructor");
    }

    public void show() {
        System.out.println("Brand : " + brand + " | Price : " + price + " | Name : " + name + " | Device type : "+ deviceType + "\n");
    }

    public static void show1() {
         System.out.println("In static method");
    }
}

class StaticKeyword {
    public static void main(String args[]) throws ClassNotFoundException
    {
        //Static variables are stored in a separate area of the JVM outside of heap and stack memories
        // Static objects should be called by Class, they can be called by Object, but it should be avoided
        // Mobile.deviceType = "Phone";
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1400;
        // obj1.name = "iPhone 16 pro max";
        
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1500;
        // obj2.name = "Galaxy S24 Ultra";

        // obj1.show();
        // obj2.show();

        // NOTE: If no object is created from a class then the class will not be loaded, and hence the static block of that class will not be executed
        // In case you still want to load a class without initialising an object, we can use Class.forName() method
        // Class.forName("Mobile");


        // We can call static method directly using a class name
        Mobile.show1();

        // A static method cannot directly access non-static elements of the class
        // It is achievable if we pass object as a parameter

    }
}