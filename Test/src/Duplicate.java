import java.util.HashSet;

public class Duplicate {
    public static void main(String args[]) {

        //taking String array
        String duplicate[] = {"eye", "leg", "eye", "ear", "hair"};
        HashSet<String> hs = new HashSet<String>();
        for (String elements : duplicate) {
            if (!hs.add(elements)) {
                System.out.println(elements);
            }
        }
    }
}
