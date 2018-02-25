package by.markovsky.tasksix.infrastructure.exception;

/**
 * Created by Pavel Markovsky on 25.02.2018.
 */
public class CustomQueueEmptyException extends Exception {

    public CustomQueueEmptyException() {
        super();
    }

    public CustomQueueEmptyException(String message) {
        super(message);
    }

}
