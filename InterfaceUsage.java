interface Computer {
    void code();
}

class Desktop implements Computer{
    public void code() {
        System.out.println("Code, compile, run faster...");
    }
}

class Laptop implements Computer{
    public void code() {
        System.out.println("Code, compile, run...");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

public class InterfaceUsage {
    public static void main(String[] args) {

        Computer lap1 = new Laptop();
        Computer comp1 = new Desktop();

        Developer saurin1004 = new Developer();
        saurin1004.devApp(lap1);
        saurin1004.devApp(comp1);
    }
}
