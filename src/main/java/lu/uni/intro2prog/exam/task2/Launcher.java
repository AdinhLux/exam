package lu.uni.intro2prog.exam.task2;

import lu.uni.intro2prog.exam.task2.drink.HotChocolate;
import lu.uni.intro2prog.exam.task2.drink.LatteMacchiato;
import lu.uni.intro2prog.exam.task2.drink.Tea;
import lu.uni.intro2prog.exam.task2.exception.OutOfCoffeeException;
import lu.uni.intro2prog.exam.task2.exception.OutOfMilkException;
import lu.uni.intro2prog.exam.task2.exception.OutOfTeaException;

/**
 * Launcher Class for 'task 2' project
 */
public class Launcher {

    /**
     * Main Method
     *
     * @param args attributes read from console batch
     */
    public static void main(String[] args) {
        // Instantiating objects
		CoffeeMachine machine = new CoffeeMachine(6, 2, 14); // enough for all 3 drinks
//      CoffeeMachine machine = new CoffeeMachine(4, 2, 14); // not enough coffee for latte macchiato, OK for tea and hot chocolate
//		CoffeeMachine machine = new CoffeeMachine(6, 2, 2);  // not enough milk for latte macchiato and hot chocolate, OK for tea
//		CoffeeMachine machine = new CoffeeMachine(6, 2, 10); // OK for latte macchiato and tea, but not enough milk for hot chocolate
//		CoffeeMachine machine = new CoffeeMachine(4, 1, 2);  // not enough for anything

        // Attempting to get and drink a latte macchiato; handle potential errors by printing a corresponding message
        try {
            LatteMacchiato lm = machine.getLatteMacchiato();

            System.out.println("drinking " + lm);
            System.out.println(lm.getCoffeePercentage() + "% coffee + " + lm.getMilkPercentage() + "% milk");
        } catch (OutOfCoffeeException | OutOfMilkException c) {
            System.out.println(c.getMessage());
        }


        // Attempting to get and drink a tea; handle potential errors by printing a corresponding message
        try {
            Tea tea = machine.getTea(2);

            System.out.println("drinking " + tea);
        } catch (OutOfTeaException t) {
            System.out.println(t.getMessage());
        }


        // Attempting to get and drink a hot chocolate; handle potential errors by printing a corresponding message
        try {
            HotChocolate chocolate = machine.getHotChocolate();

            System.out.println("drinking " + chocolate);
            System.out.println(chocolate.getMilkPercentage() + "% milk");
        } catch (OutOfMilkException hm) {
            System.out.println(hm.getMessage());
        }
    }
}
