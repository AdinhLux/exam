package lu.uni.intro2prog.exam.task2.exception;

/**
 * Custom Exception class for printing message 'Out Of Coffee capsules'
 */
public class OutOfCoffeeException extends Exception {
    public OutOfCoffeeException(String message) {

        super(message);
    }
}
