package gadingpackage.data;

public class Cat extends Animal {

    //Kalau class ini tidak abstract maka jika parent class memiliki method abstract maka class ini wajib menggunakan method tersebut
    public void run(){
        System.out.println("Cat " + name + "is run");
    }

}
