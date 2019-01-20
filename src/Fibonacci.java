/**
 * Created by mario on 19/01/19.
 */
public class Fibonacci {
    public static void main(String args[]) {
        //dibin(6);
        odd(2);
    }


    public static void odd(int start) {
        if (start % 2 == 0) {
            start = start + 1;
        }
        for (int x = start; x < 10; x+=2) {
            System.out.println("odd: " + x);
        }
        System.out.println("option 2");
        for (int x = start; x < 10; x++) {
            if (x % 2 != 0) {
                System.out.println("odd: " + x);
            }
        }
    }

    // 1, 1, 2, 3, 5, 8, 13, 21, 34
    // n = (n - 1) + (n - 2)
    public static void dibin(int limit) {
        int n1 = 1;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int x = 0; x < limit; x++) {  // run this block of code 'n' times
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
