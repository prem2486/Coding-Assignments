package StringOperations;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Java,Python,C++";
        String[] words = str.split(",");
        System.out.println("Splitted Strings: " + Arrays.toString(words));
    }
}
