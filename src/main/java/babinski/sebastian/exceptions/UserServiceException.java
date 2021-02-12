package babinski.sebastian.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 8840190986317231459L;

    public UserServiceException(String message) {
        super(message);
    }
}
