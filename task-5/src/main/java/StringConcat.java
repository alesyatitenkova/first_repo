public class StringConcat {

    public static void main(String[] args) {
        String result = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result += i + " ";
        }
        long end = System.currentTimeMillis();
        System.out.println(result);
        double total = (double) (end - start) / 1000;
        System.out.println("Конкатенацяи выполнено за - " + total + " секунд");

        StringBuilder result2 = new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result2.append(i).append(" ");
        }
        end = System.currentTimeMillis();
        System.out.println(result);
        total = (double) (end - start) / 1000;
        System.out.println("Стринг билдер выполнено за - " + total + " секунд");
    }
}
