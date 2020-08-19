I've created a project containing **2 exercices (packages)**: 

- 'task1' where you just compare Volume between 2 Storage objects.
- 'task2' where you define a Launcher class **instantiating a Coffee Machine  object** and you ask for different Drinks (Latte Macchiato, Hot Chocolate, Tea).

## Diagram Class for 'task2'

Below is a Diagram Class I've drawned with draw.io:

> - *Launcher.java* (contains **main** method)
> - *CoffeeMachine.java* (where you ask for different Drinks : Latte Macchiato, Hot Chocolate, Tea)
> - **Interfaces** : *MilkDrink.java* & *CoffeeDrink.java*
> - **Abstract class** : *Drink.java* 
> - **Custom Exceptions** used in  *CoffeeMachine.java* : *OutOfCoffeeException.java*,  *OutOfMilkException.java* & *OutOfTeaException.java*

<img src="https://i.imgur.com/wBy88s8.png" width="650" height="450" />


## UML Javadoc
As my project is a Maven project, you can open a **Git bash** at the Project's root and type the following command to generate Javadoc with UML graphs:
    
    mvn clean site
    
You can check the POM.xml configuration if you're curious.
