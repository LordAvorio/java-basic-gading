package gadingpackage.application;

import gadingpackage.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Gading", "Uganda");
        System.out.println("Konek database sukses !");
    }

    public static void connectDatabase(String username, String password){    
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }

}
