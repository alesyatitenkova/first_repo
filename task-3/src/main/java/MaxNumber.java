public class MaxNumber {

    public static void main(String[] args) {
       int n = 1;
        while (3 * n * n - 730 * n < 0) {
            n++;
        }
        System.out.println("result is - " + n);
    }
}
