public class Fibonacci2 {
    public static void main(String[] args) {
        int n=15, a=1, b=1, i;
        System.out.println("Число Фибоначи: ");
        System.out.print(a+" "+b);
        for (i=3;i<=n;i++){
        b=a+b;
        a=b-a;
        System.out.print(" "+b);
        }
    }
}
