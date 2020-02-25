public class Recursion {
    public static void main(String[] args) {
        doSome(0);
    }

    public static void doSome(int i) {
        System.out.println(i);
        doSome(++i);
    }
}
