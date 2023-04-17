package myexception;

public class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message) {
        super(message);
    }
}
