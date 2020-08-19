package lu.uni.intro2prog.exam.task2;

import lu.uni.intro2prog.exam.task2.drink.HotChocolate;
import lu.uni.intro2prog.exam.task2.drink.LatteMacchiato;
import lu.uni.intro2prog.exam.task2.drink.Tea;
import lu.uni.intro2prog.exam.task2.exception.OutOfCoffeeException;
import lu.uni.intro2prog.exam.task2.exception.OutOfMilkException;
import lu.uni.intro2prog.exam.task2.exception.OutOfTeaException;

/**
 * Class representing a Coffee Machine
 */
public class CoffeeMachine {

    /**
     * The quantity of Coffee capsules
     */
    private int coffeeCapsules;
    /**
     * The quantity of Tea capsules
     */
    private int teaCapsules;
    /**
     * The quantity of Milk capsules
     */
    private int milkCapsules;

    /**
     * Constructor
     *
     * @param coffeeCapsules The quantity of Coffee capsules
     * @param teaCapsules    The quantity of Tea capsules
     * @param milkCapsules   The quantity of Milk capsules
     */
    public CoffeeMachine(int coffeeCapsules, int teaCapsules, int milkCapsules) {
        this.coffeeCapsules = coffeeCapsules;
        this.teaCapsules = teaCapsules;
        this.milkCapsules = milkCapsules;
    }

    /**
     * Returns a 'LatteMacchiato' object
     *
     * @return a 'LatteMacchiato' object
     * @throws OutOfCoffeeException If not enough Coffee capsules
     * @throws OutOfMilkException   If not enough Milk capsules
     */
    public LatteMacchiato getLatteMacchiato() throws OutOfCoffeeException, OutOfMilkException {
        // requires 6 coffee capsules + 4 milk capsules
        if (this.coffeeCapsules < 6)
            throw new OutOfCoffeeException("Not enough coffee for latte macchiato");

        if (this.milkCapsules < 4)
            throw new OutOfMilkException("Not enough milk for latte macchiato");

        // prepare latte macchiato (200 ml)
        LatteMacchiato lm = new LatteMacchiato(200, 6, 4);

        // Update private fields
        this.coffeeCapsules = this.coffeeCapsules - 6;
        this.milkCapsules = this.milkCapsules - 4;

        return lm;
    }

    /**
     * Returns a 'Tea' object
     *
     * @param strength Tea concentration
     * @return a 'Tea' object
     * @throws OutOfTeaException If not enough Tea capsules
     */
    public Tea getTea(int strength) throws OutOfTeaException {
        // requires strength tea capsules
        if (strength < this.teaCapsules)
            throw new OutOfTeaException("Not enough Tea Capsules");

        // prepare tea (333 ml)
        Tea tea = new Tea(333, strength);

        // Update private fields
        this.teaCapsules = this.teaCapsules - strength;

        return tea;
    }

    /**
     * Returns a 'HotChocolate' object
     *
     * @return a 'HotChocolate' object
     * @throws OutOfMilkException If not enough Milk capsules
     */
    public HotChocolate getHotChocolate() throws OutOfMilkException {
        // requires 10 milk capsules
        if (this.milkCapsules < 10)
            throw new OutOfMilkException("Not enough milk for hot chocolate");

        // prepare hot chocolate (200 ml)
        HotChocolate hc = new HotChocolate(200, 10);

        // Update private fields
        this.milkCapsules = this.milkCapsules - 10;

        return hc;
    }
}
