public class CalculateWords {

    public static void main(String[] args) {
        String text = "  Тестовая, строка, с несколькими, запятыми. В ней будет тестовая запись.  ";
        text = text.trim();
        String[] words = text.split(" ");
        System.out.println("Количество слов используя массив = " + words.length);
        int n = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if (symbol == ' ') {
                n ++;
            }
        }
        n++;
        System.out.println("Количество слов используя цикл = " + n);
    }
}
