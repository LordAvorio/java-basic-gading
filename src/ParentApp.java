public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Eko";
        child.doIt();
        System.out.println(child.name);

        // Yang keluar method di child
        Parent parent = child;
        parent.doIt();
        
        //Hasil keluaran akan null karena tidak ada yang namanya variable overriding
        //Overriding pada java hanya terjadi pada method saja
        System.out.println(parent.name);
    }
}
