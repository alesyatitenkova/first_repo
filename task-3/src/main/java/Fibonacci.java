public class Fibonacci {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, sum;
        for(int i = 0; i <= 20; i++) {
            if (i == 0) {
                System.out.print(i);
            } else if (i < 2) {
                System.out.print(" " + i);
                num2 = i;
            } else {
                sum = num1 + num2;
                System.out.print(" " + sum);
                num1 = num2;
                num2 = sum;
            }
        }
    }
}

