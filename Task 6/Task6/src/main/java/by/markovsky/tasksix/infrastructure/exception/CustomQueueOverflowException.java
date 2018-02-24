package by.markovsky.tasksix.infrastructure.exception;

/**
 * Created by Pavel Markovsky on 24.02.2018.
 */
public class CustomQueueOverflowException extends Exception {

    public CustomQueueOverflowException() {
        super();
    }

    public CustomQueueOverflowException(String message) {
        super(message);
    }

}
