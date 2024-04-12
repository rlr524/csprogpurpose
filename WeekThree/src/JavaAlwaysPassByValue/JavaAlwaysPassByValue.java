package JavaAlwaysPassByValue;

public class JavaAlwaysPassByValue {
    public static void main(String[] args) {
        // myCheese doesn't hold the object, holds a reference to the location in memory of the object
        Cheese myCheese = new Cheese();

        myCheese.setLevelOfStinkiness(10);

        System.out.println(myCheese.getLevelOfStinkiness()); // Prints 10

        // When myCheese is passed to this function and used as the argument for cheese, the variable
        // cheese holds the value of the same memory address as myCheese, it copies the memory address,
        // so it ends up pointing to the value stored in the memory address that myCheese points to, which
        // is 10, when the function runs, it changes that value
        increaseStinkiness(myCheese);
        System.out.println(myCheese.getLevelOfStinkiness()); // Prints 11
    }

    private static void increaseStinkiness(Cheese cheese) {
        // Changes the value of myCheese when it's passed in to the method in the main method
        cheese.setLevelOfStinkiness(cheese.getLevelOfStinkiness() + 1);
        // If we create a new cheese object the level of stinkiness directly on cheese with the setter, it breaks
        // the connection to myCheese, so doing this:
        cheese = new Cheese();
        cheese.setLevelOfStinkiness(756); // The prints on L10 and L17 above still print 10 and 11
        System.out.println(cheese.getLevelOfStinkiness()); // Prints 756 (runs between the 10 and 11 prints
        // because the function is invoked before the print on L17
    }
}
