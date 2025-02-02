class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "John";
    }

    // Constructor overloading
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // Preference is always given to local variable
        // We need to use this keyword sometimes to inform the machine that here we are refering the instance variable and not the local variable
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
public class EncapsulationConcept {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(22, "Saurin");
        // obj.setAge(22);
        // obj.setName("Saurin");

        System.out.println("Age : " + obj.getAge() + " | Name : " + obj.getName());
        System.out.println("Age : " + obj1.getAge() + " | Name : " + obj1.getName());
        
    }
}
