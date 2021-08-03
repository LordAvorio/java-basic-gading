package gadingpackage.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Gading";
        first = first + " " + "Prakoso";

        System.out.println(first);

        String second = "Gading Prakoso";
        System.out.println(second);

        //Hasil dari perbandingan ini akan berbeda karena yang dibandingkan adalah objek yang berbeda
        System.out.println(first == second);

        System.out.println(first.equals(second));
    }
}
