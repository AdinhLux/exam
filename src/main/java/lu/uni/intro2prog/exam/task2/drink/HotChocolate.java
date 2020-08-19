package lu.uni.intro2prog.exam.task2.drink;

/**
 * Class representing a Hot Chocolate object
 */
public class HotChocolate extends Drink implements MilkDrink {

    /**
     * The quantity of Milk capsules
     */
    private final int milkCapsules;

    /**
     * Constructor
     *
     * @param milliliter   volume of Hot Chocolate
     * @param milkCapsules The quantity of Milk capsules
     */
    public HotChocolate(int milliliter, int milkCapsules) {
        super(milliliter);
        this.milkCapsules = milkCapsules;
    }

    /**
     * Inherited method from 'Object' class.
     *
     * @return a personalized message.
     */
    @Override
    public String toString() {
        return "HotChocolate [" + getMilliliter() + " ml, milk capsules=" + this.milkCapsules + "]";
    }

    /**
     * Returns Milk percentage
     *
     * @return Milk percentage
     */
    @Override
    public int getMilkPercentage() {
        return (int) Math.round(milkCapsules * 100.0 / 10);
    }
}
