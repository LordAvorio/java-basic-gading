package gadingpackage.data;

public interface Car extends HasBrand, IsMaintenance {

    // Class car mengoverride class HasBrand dan IsMaintenance sehingga ketika
    // mengimplements class Car di class lain maka seluruh method yang diextends
    // harus wajib dipanggil

    // By Default seluruh method interface akan menjadi public abstract

    void drive();

    int getTire();

    // Ketika melakukan default method maka method ini tidak wajib dipanggil di
    // kelas turunan
    default boolean isBig() {
        return false;
    }

}
