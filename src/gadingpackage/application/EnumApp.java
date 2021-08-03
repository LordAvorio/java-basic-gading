package gadingpackage.application;

import gadingpackage.data.Customer;
import gadingpackage.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        
        Customer customer = new Customer();
        customer.setName("Gading");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        //KONVERSI ENUM KE STRING
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        for (var value : Level.values()) {
            System.out.println(value);
        }

    }
}
