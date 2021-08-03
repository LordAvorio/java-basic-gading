package gadingpackage.application;

import gadingpackage.data.Application;
import gadingpackage.data.Constant;
import gadingpackage.data.Country;
import gadingpackage.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
            MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Solo");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
        
    }
}
