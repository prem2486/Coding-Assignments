package StringOperations;

public class StringMatching {
    public static void main(String[] args) {
        String str = "abc123";
        System.out.println("Contains only letters and digits: " + str.matches("[a-zA-Z0-9]+"));
    }
}
