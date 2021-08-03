package gadingpackage.application;


public class StackTraceApp {
    public static void main(String[] args) {

        //StackTrace untuk mengetahui error di baris berapa

        try{
            sampleError();
        }catch(RuntimeException exception){
            exception.printStackTrace();
        }

    }

    public static void sampleError(){
        try{
            String[] names = {
                "Gading", "Condro", "Prakoso"
            };

            System.out.println(names[100]);
        }catch(Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }

}
