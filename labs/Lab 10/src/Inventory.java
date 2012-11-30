
import java.io.File;
import java.util.Scanner;


public class Inventory {
    public Product[] inv = new Product[20];
    public int products;

    public Inventory() throws Exception {
        Scanner file = new Scanner(new File("datafile.txt"));
        int i = 0;
        while (file.hasNext()) {
            Scanner line = new Scanner(file.nextLine()).useDelimiter(",");
            if (line.hasNext()) {
                String name = line.next();
                String PN = line.next();
                String type = line.next();
                double cost = line.nextDouble();
                inv[i] = new Product(name, PN, type, cost);
                i++;
            }
        }
        products = i;
    }
    
    public String toString() {
        String s = "";
        
        for (int i = 0; i < 20; i++) {
            if (inv[i] != null){
                s += inv[i].toString() + "\n";
            }
        }
        
        return  s;
    }
}
