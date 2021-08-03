public class PolymorphismeApp {
    public static void main(String[] args) {
        

        //Perubahan bentuk objek ke bentuk objek lain (Polimorfisme)
        //Walaupun kelas employee namun bisa memanggil objek yang lain dan merubahnya
        Employee employee = new Employee("Gading");
        employee.sayHello("Budi");

        employee = new Manager("Gading");
        employee.sayHello("Budi");

        employee = new VicePresident("Gading");
        employee.sayHello("Budi");

        sayHello(new Employee("Gading"));
        sayHello(new VicePresident("Rudi"));
        sayHello(new Manager("Bakayoko"));


    }

    static void sayHello(Employee employee){

        //Instanceof berfungsi untuk melakukan pengecekan tipe data
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello VP " + employee.name);
        }
    }

}
