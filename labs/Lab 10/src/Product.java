
public class Product {
    public String name, PN, type;
    public double cost;
    
    public Product(String name, String PN, String type, double cost) {
        this.name = name;
        this.PN = PN;
        this.type = type;
        this.cost = cost;
    }
    
    public String toString() {
        return ("" + name + "\t" + PN + "\t" + type + "\t" + cost);
    }
}
