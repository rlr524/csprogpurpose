public class EqualsMethodVsDoubleEqual {
    public static void main(String[] args) {
        // When we use String as the type of the variable, or a "string literal", we are essentially using
        // it like a primitive and the variables refer to their values, so here, the two will be equal when using ==
        // In this case, with string literals, Java is "interning" these strings, holding the value of "Madison"
        // in the same place in memory and both variables are pointing there.
        String string1 = "Madison";
        String string2 = "Madison";

        // But when we create a string by instantiating a new String object, the variables refer to their
        // memory locations, not the value inside the memory locations, so we get the strings are not equal here
        // when using ==
        String string3 = new String("Madison");
        String string4 = new String("Madison");

        if (string3 == string4) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Keep in mind, this works for the objects on String, as String has already implemented an equals()
        // method, as have all other classes in the Java standard library on which you would use equals().
        // But if you create your own class and want to use equals(), you need to implement the method on
        // your class yourself, as the Object class implementation of equals() is only doing a simple ==
        // comparison, it returns (this == obj). An example implementation of an equals() method in your own
        // class would look like the example in the Dog class in this folder.

        if (string3.equals(string4)) {
            System.out.println("Using equals, the strings are equal.");
        } else {
            System.out.println("Using equals, the strings are not equal.");
        }
    }
}
