// Abstract is basically used to declare that this method needs to be implemented when this class is inherited

// An abstract class need NOT have an abstract method

// An abstract class can have normal methods

// An abstract class can have multiple abstract methods

// We cannot create an object of abstract class. To instantialize an abstract class, we need to create an inherited concrete class

abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing music");
    }
}

abstract class Ferrari extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}

class UpdatedFerrari extends Ferrari { //concrete class
    public void fly() {
        System.out.println("Flying");
    }
    
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // We can't create object of abstract class
        // Car obj = new Car();
        Car obj = new UpdatedFerrari();
        obj.drive();
        obj.playMusic();
    }
}
