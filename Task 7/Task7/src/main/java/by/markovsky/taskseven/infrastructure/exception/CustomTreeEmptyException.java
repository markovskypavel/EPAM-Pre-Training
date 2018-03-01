package by.markovsky.taskseven.infrastructure.exception;

/**
 * Created by Pavel Markovsky on 01.03.2018.
 */
public class CustomTreeEmptyException extends Exception {

    public CustomTreeEmptyException() {
        super();
    }

    public CustomTreeEmptyException(String message) {
        super(message);
    }

}
