package lu.uni.intro2prog.exam.task2.exception;

/**
 * Custom Exception class for printing message 'Out Of Tea capsules'
 */
public class OutOfTeaException extends Exception {
    public OutOfTeaException(String message) {
        super(message);
    }
}
