public class ReverseString {
    public static void main(String args[]) {

        String string = "hello";
        String reverse = "";

        StringBuilder sb = new StringBuilder(string);
        System.out.println("string builder: " + sb.reverse());

        for (int i = string.length() - 1; i >= 0; i--){
            reverse = reverse + string.charAt(i);
        }
        System.out.println("reverse: " + reverse);

    }
}