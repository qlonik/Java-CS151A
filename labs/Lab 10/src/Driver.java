
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        Scanner scan = new Scanner(System.in);
        String input, name, cat, prodNum;
        double price;
        
        do {
            if (inventory.products < 20) {
                System.out.print("Write number of option (a, b, c, d, e, f, or q to quit): ");
                input = scan.next();
                System.out.println();
            } else {
                System.out.print("Write number of option (a, b, c, d, e, or q to quit): ");
                input = scan.next();
                System.out.println();
            }
            
            scan.nextLine();
            switch (input) {
                case "a":
                    System.out.println(inventory);
                    break;
                case "b":
                    System.out.print("Input the max price: ");
                    price = scan.nextDouble();
                    System.out.println();
                    for (int i = 0; i < 20; i++) {
                        if (inventory.inv[i] != null && inventory.inv[i].cost <= price) {
                            System.out.println(inventory.inv[i]);
                        }
                    }
                    break;
                case "c":
                    System.out.print("Input the min price: ");
                    price = scan.nextDouble();
                    System.out.println();
                    
                    for (int i = 0; i < 20; i++) {
                        if (inventory.inv[i] != null && inventory.inv[i].cost >= price) {
                            System.out.println(inventory.inv[i]);
                        }
                    }
                    break;
                case "d":
                    System.out.println("Write a category: ");
                    cat = scan.next();
                    System.out.println();
                    
                    for (int i = 0; i < 20; i++) {
                        if (inventory.inv[i] != null && 
                                inventory.inv[i].type.toLowerCase().indexOf(cat.toLowerCase()) != -1) {
                            System.out.println(inventory.inv[i]);
                        }
                    }
                    break;
                case "e":
                    System.out.println("Write a Product Number: ");
                    prodNum = scan.next();
                    System.out.println();
                    
                    for (int i = 0; i < 20; i++) {
                        if (inventory.inv[i] != null && 
                                inventory.inv[i].PN.equals(prodNum.toUpperCase())) {
                            System.out.println(inventory.inv[i]);
                        }
                    }
                    break;
                case "f":
                    if (inventory.products < 20) {
                        System.out.print("Input name: ");
                        name = scan.nextLine();
                        System.out.println();
                        
                        System.out.print("Input product number: ");
                        prodNum = scan.nextLine();
                        System.out.println();
                        
                        System.out.print("Input type: ");
                        cat = scan.nextLine();
                        System.out.println();
                        
                        System.out.print("Input price: ");
                        price = scan.nextDouble();
                        System.out.println();
                        
                        inventory.inv[inventory.products] = new Product(name, prodNum, cat, price);
                        inventory.products++;
                    }
                    break;
            }
        } while (!input.equals("q"));
    }
}