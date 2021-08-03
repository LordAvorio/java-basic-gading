package gadingpackage.application;

import gadingpackage.data.LoginRequest;
import gadingpackage.error.ValidationException;
import gadingpackage.utils.ValidationUtil;

//ADA 3 EXCEPTION CHECKER EXCEPTION, RUNTIME EXCEPTION, ERROR

public class ValidationApp {
    public static void main(String[] args) {
        
        LoginRequest loginRequest = new LoginRequest("", "Gewehr");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch(ValidationException | NullPointerException exception){
            System.out.println("Error Message : " + exception.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }

        //Penulisan runtime digunakan untuk clean code dalam project besar
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);


    }
}
