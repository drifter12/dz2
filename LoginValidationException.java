public class LoginValidationException extends Exception {
    public LoginValidationException() {
        System.out.print("Incorrect login!");
    }
    public LoginValidationException(String message) {
        super(message);
    }
}
