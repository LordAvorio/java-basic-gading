package gadingpackage.application;

import gadingpackage.data.City;
import gadingpackage.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        // var location = new Location(); //ERROR karena abstract class

        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
