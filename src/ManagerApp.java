public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        // Inherit class VP bisa mengambil method dari class parent(Manager)
        var vp = new VicePresident();
        vp.name = "Joko";
        vp.sayHello("Marino");

        

    }
}
