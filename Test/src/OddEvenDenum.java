public class OddEvenDenum {

    public static void main(String args[]) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " EVEN");
                if (i % 10 == 0) {
                    System.out.println(i + " Denum of 10");
                }
            } else {
                System.out.println(i + " ODD");
            }
        }

//            //Let's create an array of 10 numbers to check number is even or odd
//            int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 == 0)//Use modulus(%) operator to check even or odd
//                {
//                    System.out.println(a[i] + "is even number");
//                } else {
//                    System.out.println(a[i] + "is odd number");
//                }
//            }
    }
}
