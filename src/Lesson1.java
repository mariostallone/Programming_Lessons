/**
 * Created by mario on 19/01/19.
 */
public class Lesson1 {
    public static void main(String args[]) {
       int out1 = addition(5, 3);
       int out2 = addition(out1, 10);
       System.out.println(out1);
       System.out.println(out2);
       System.out.println(addition(30, 5.3));
       System.out.println(addition(30.2, 5.3));

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        for (int x = 0; x < 5; x++) {
            System.out.println(arr[x]);
        }

        for (int x = 0; x < 5; x++) {
            arr[x] = arr[x] + 3;
        }

        for (int x = 0; x < 5; x++) {
            System.out.println(arr[x]);
        }
    }

    // This function is used to add two numbers
    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static double addition(double a, double b) {
        System.out.println("add with double");
        double sum = a + b;
        return sum;
    }
    
    public static int product(int a, int b) {
        int sum = a * b;
        return sum;
    }
}
