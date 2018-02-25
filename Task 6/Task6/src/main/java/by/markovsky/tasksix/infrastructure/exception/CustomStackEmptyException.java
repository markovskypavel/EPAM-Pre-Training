package by.markovsky.tasksix.infrastructure.exception;

/**
 * Created by Pavel Markovsky on 25.02.2018.
 */
public class CustomStackEmptyException extends Exception {

    public CustomStackEmptyException() {
        super();
    }

    public CustomStackEmptyException(String message) {
        super(message);
    }

}
