package lu.uni.intro2prog.exam.task2.drink;

/**
 * Class representing Tea object.
 */
public class Tea extends Drink {

    /**
     * Tea concentration
     */
    private final int strength;

    /**
     * Constructor
     *
     * @param milliliter volume of Tea
     * @param strength   Tea concentration
     */
    public Tea(int milliliter, int strength) {
        super(milliliter);
        this.strength = strength;
    }

    /**
     * Inherited method from 'Object' class.
     *
     * @return a personalized message.
     */
    @Override
    public String toString() {
        return "Tea [" + getMilliliter() + " ml, strength=" + this.strength + "]";
    }

    /**
     * Returns Tea concentration
     *
     * @return Tea concentration
     */
    public int getStrength() {
        return this.strength;
    }
}
