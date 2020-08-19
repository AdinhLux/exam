package lu.uni.intro2prog.exam.task2.drink;

/**
 * Class representing Latte Macchiato object.
 */
public class LatteMacchiato extends Drink implements MilkDrink, CoffeeDrink {

    /**
     * The quantity of Coffee capsules
     */
    private final int coffeeCapsules;
    /**
     * The quantity of Milk capsules
     */
    private final int milkCapsules;

    /**
     * Constructor
     *
     * @param milliliter     volume of Latte Macchiato
     * @param coffeeCapsules The quantity of Coffee capsules
     * @param milkCapsules   The quantity of Milk capsules
     */
    public LatteMacchiato(int milliliter, int coffeeCapsules, int milkCapsules) {
        super(milliliter);
        this.coffeeCapsules = coffeeCapsules;
        this.milkCapsules = milkCapsules;
    }

    /**
     * Inherited method from 'Object' class.
     *
     * @return a personalized message.
     */
    @Override
    public String toString() {
        return "LatteMacchiato [" + getMilliliter() + " ml, coffee capsules=" + this.coffeeCapsules + ", milk capsules=" + this.milkCapsules + "]";
    }

    /**
     * Returns Milk percentage
     *
     * @return Milk percentage
     */
    @Override
    public int getMilkPercentage() {
        return (int) Math.round(this.milkCapsules * 100.0 / 10);
    }

    /**
     * Returns Coffee percentage
     *
     * @return Coffee percentage
     */
    @Override
    public int getCoffeePercentage() {
        return (int) Math.round(this.coffeeCapsules * 100.0 / 10);
    }
}
