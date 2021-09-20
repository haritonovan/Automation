package practice;

public class PrimitiveType {
    public static void main(String[] args) {

        // Double Primitive Type Practice

        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
       System.out.println(doubleMaxValue);

       double doubleValue = 1337.13;
        System.out.println(doubleValue);

        //Float primitive type practice
        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 1000.15f;

        //Long primitive type practice


        //Int primitive type practice
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        int firstVariable = 200;
        int secondVariable = 400;

        System.out.println(Integer.max(200, 400));


       //Method coll
        printHelloWorld();

        //String
        String myName = "Nataly ";
        String lastName = "Haritonova";
        //Nataly Haritonova
        System.out.println(myName + " " + lastName);
        System.out.printf("%s %s\n", myName,lastName);

        String nameAndLastName = String.format("%s %s\n", myName, lastName);
        System.out.println(nameAndLastName);






    }

    public static void printHelloWorld() {
        System.out.println("Hello World");

    }
}
