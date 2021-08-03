package gadingpackage.data;

public record LoginRequest(String username, String password) {
    
    public LoginRequest {
        System.out.println("Membuat object Login Request");
    }

}
