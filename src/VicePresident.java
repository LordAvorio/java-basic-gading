public class VicePresident extends Manager{


    //Constructor harus dipanggil menggunakan super karena di parent terdapat constructor
    VicePresident(String name){
        super(name);
    }

    
    //Method Overriding(Menuliskan ulang method dari parent kemudian di custom di child, method di parent sudah tidak bisa digunakan)
    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }

    

}
