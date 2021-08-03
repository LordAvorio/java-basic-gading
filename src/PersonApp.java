public class PersonApp {
    public static void main(String[] args) {
        

        var person1 = new Person("Gading","Surakarta");
       

        var person3 = new Person("Zouie","Jogja");
        

        
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Budi");
        person3.sayHello("Ronald");

    }
}
