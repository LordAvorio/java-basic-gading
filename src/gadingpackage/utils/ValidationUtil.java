package gadingpackage.utils;

import gadingpackage.data.LoginRequest;
import gadingpackage.error.BlankException;
import gadingpackage.error.ValidationException;

public class ValidationUtil {
    
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        }else if(loginRequest.password().isBlank()){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    //Penulisan throws tidak wajib
    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("Username tidak boleh kosong");
        }else if(loginRequest.password().isBlank()){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password tidak boleh kosong");
        }
    }

}
