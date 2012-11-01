
import java.text.NumberFormat;
import java.util.Random;


/**
 * Person.java
 * @author Nikita Volodin
 * 
 * Class represents a person
 */
public class Person {
    private String name;
    private double money;
    
    public Person (String inputName) {
        name = inputName;
        money = genMoney();
    }
    
    private double genMoney() {
        Random rnd = new Random();
        return (rnd.nextDouble() * 999999 + 1);
    }
    
    public String getName() {
        return name;
    }
    
    public double getMoney() {
        return money;
    }
    
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return getName() + "\t" + fmt.format(getMoney());
    }
}
