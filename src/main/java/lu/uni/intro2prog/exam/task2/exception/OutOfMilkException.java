package lu.uni.intro2prog.exam.task2.exception;

/**
 * Custom Exception class for printing message 'Out Of Milk capsules'
 */
public class OutOfMilkException extends Exception {
    public OutOfMilkException(String message) {
        super(message);
    }
}
