package gadingpackage.data;

public class Application {
    

    public static final int PROCESSORS;

    //STATIC BLOCK
    static {
        System.out.println("Mengakses class application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}
