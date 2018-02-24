package by.markovsky.tasksix.infrastructure.exception;

/**
 * Created by Pavel Markovsky on 24.02.2018.
 */
public class CustomStackOverflowException extends Exception {

    public CustomStackOverflowException() {
        super();
    }

    public CustomStackOverflowException(String message) {
        super(message);
    }

}
