package gadingpackage.error;

public class ValidationException extends Throwable {

    //Biasanya exception terjadi di method
    public ValidationException(String message) {
        super(message);
    }

}
