package practice.classroom;

public class LoopPractice {
    public static void main(String[] args) {

        // for
        /*
        for (statement1; statement2; statement3)
        //code block to be executed

        statement 1 - is executed (one time) of the code block
        // Initialize counter variable: (int i = 0);

        statement 2 - define the condition for executing the code block
        // Boolean condition;
        // Element list = 10;
        // i < 10;

        //statement 3 - is executed (every time)

         */

        for (int i = 0; i < 10;i++){
            System.out.println("Hello World");
        }

        String [] names ={"Nikita", "Andrew", "Max", "Anthony"};
        for (int i = 1; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int [] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
        if(numbers1[i] > 4) {
            System.out.println(numbers1[i]);
        } else  {
            System.out.println("Number is less then 4:" + numbers1[i]);
        }
        }

        //конкретный участок проверяет
        String [] names1 ={"Nikita", "Andrew", "Max", "Anthony","Andrew"};
        for (int i =0; i < names1.length; i++){
            if (names1[i].equals("Andrew")) {
                System.out.println("I found Andrew!");
            }
        }
        //по всему что находится в массиве
        for (String name : names) {
            System.out.println(name);
        }





    }

}
