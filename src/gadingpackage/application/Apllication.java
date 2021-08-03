package gadingpackage.application;

import gadingpackage.data.Product;

// import gadingpackage.data.*;
// Gunakan tanda bintang untuk mengimport semua yang ada dalam package


public class Apllication {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
