// enums are short for enumeration - they are named constants

// enum - is a class - so it can have methods, constructors, but cannot be extended

// enum Status {// Basically Status will be the class here and all the following are its objects
//     Running, Failed, Pending, Success;
// }


enum Laptop {
    Macbook(2000), XPS(), Thinkpad(1800), Surface(1500);

    private int price;

    private Laptop() {
        price = 500;
        System.out.println("in default laptop " + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}




public class Enumeration {
    public static void main(String[] args) {
        // Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal());



        // Status ss[] = Status.values();
        // for(Status s: ss) {
        //     System.out.println(s + " : " + s.ordinal());
        // }




        // Status s = Status.Success;
        // System.out.println(s.getClass().getSuperclass());

        // switch (s) {
        //     case Running:
        //         System.out.println("All good");
        //         break;
        //     case Success:
        //         System.out.println("Done :)");
        //         break;
        //     case Pending:
        //         System.out.println("Please wait");
        //         break;
        //     case Failed:
        //         System.out.println("Try again");
        //         break;
        
        //     default:
        //         break;
        // }

        // if(s == Status.Failed)
        //     System.out.println("Try again :(");
        // else if(s == Status.Pending)
        //     System.out.println("Please wait");
        // else if(s == Status.Running)
        //     System.out.println("All good");
        // else 
        //     System.out.println("Done :)");




        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());




        for(Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
