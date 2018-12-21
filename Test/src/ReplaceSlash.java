import java.util.LinkedHashSet;

public class ReplaceSlash {
    public static void main(String[] args) {
        String test = "folder1/folder2/folder2/folder3\\";

        //Replacing special chars
        test = test
                .replace("/", ",")
                .replace("\\", ",")
                .replaceAll("[,]+$", "");

        System.out.println("Replace: " + test);

        //Split into array
        String array[] = test.split(",");

        System.out.print("Array: ");

        //Printing out from array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        LinkedHashSet<String> store = new LinkedHashSet<>();

        System.out.print("\nSet: " );

        //Printing out from Set and removing duplicates
        for (String setArray : array) {
            if (store.add(setArray) == true) {
                System.out.print(setArray + " ");
            }
        }

        //Joining back into string
        String joined = String.join(",", store);

        System.out.println("\nAdmin," + joined);

    }
}
