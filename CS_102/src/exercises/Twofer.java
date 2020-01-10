package exercises;

public class Twofer {
    public static void main(String[] args) {
        String name = "robot";
        //System.out.print(twofer(name));
        System.out.println(reverse(name));
    }
    static String reverse(String inputString) {
        String reversedInput = "";
        for (int i = 0; i < inputString.length(); i++) {
            reversedInput = inputString.charAt(i) + reversedInput;
        }
        return reversedInput;
    }
}
