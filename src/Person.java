public class Person {
    String name;
    String address;
    final String country = "Indonesia";


    //Constructor (dipanggil pertama kali saat membuat object dan memaksa untuk mengisi field)
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Constructor overloading (parameter harus berbeda !)
    public Person(String name) {
        this.name = name;
    }



    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }

}
