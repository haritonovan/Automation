package practice.classroom;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String [] emptyArray = new String[4];
        emptyArray [0] = "Nikolay";
        emptyArray [1] = "Max";
        emptyArray [2] = "Janis";
        emptyArray [3] = "Armands";
       //  emptyArray [4] = "Alex";
      //  Index 4 out of bounds for length 4
        System.out.println(Arrays.toString(emptyArray));

        boolean [] booleanArray = {true, false, true,false};
        boolean isAutumn = booleanArray [0];
        boolean isHotOutside = booleanArray [1];
        System.out.printf("Outside is quite hot: %s ",isHotOutside);
    }
}
