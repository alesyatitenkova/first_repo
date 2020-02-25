public class StringST {
    public static void main(String[] args) {
        String str = "Тестовая, строка, с несколькими, . , . ? запятыми";
        int n = 0;
        int m = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {

            symbol = str.charAt(i);
            if (symbol == ',') {
                n ++;
            } else if (symbol == '.'){
                m++;
            }
        }
        System.out.println("У нас есть " + n + " запятых " + m + " точек");
    }
}
