public class Palindrome {
    public static void main(String[] args) {

        String str = "MADAM";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equalsIgnoreCase(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }
}
