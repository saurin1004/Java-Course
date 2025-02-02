class Laptop {
    String model;
    int price;

    // Created using right click -> source actions -> toString
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    // Created using right click -> source actions -> hashCode and equals
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

     
}

public class ExtendsObject {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Macbook Pro";
        obj1.price = 1300;

        Laptop obj2 = new Laptop();
        obj2.model = "Macbook Pro";
        obj2.price = 1300;

        boolean result = obj1.equals(obj2);

        System.out.println(result); // When we try to print an object, it by default calls the toString() method

    }
}
