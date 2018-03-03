package by.markovsky.tasksix.infrastructure.exception;

/**
 * Created by Pavel Markovsky on 03.03.2018.
 */
public class CustomContainerEmptyException extends Exception {

    public CustomContainerEmptyException() {
        super();
    }

    public CustomContainerEmptyException(String message) {
        super(message);
    }

}
