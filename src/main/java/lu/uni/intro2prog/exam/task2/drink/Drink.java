package lu.uni.intro2prog.exam.task2.drink;

/**
 * Abstract Class 'Drink'
 */
public abstract class Drink {

    /**
     * The volume of a Drink in milliliters
     */
    private final int milliliter;

    /**
     * Constructor
     *
     * @param milliliter the volume of a Drink in milliliters
     */
    public Drink(int milliliter) {
        this.milliliter = milliliter;
    }

    /**
     * Returns the volume of a Drink in milliliters
     *
     * @return the volume of a Drink in milliliters
     */
    public int getMilliliter() {
        return this.milliliter;
    }
}
