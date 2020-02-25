public class LastLetters {

    public static void main(String[] args) {
        String text = "  Тестовая, строка, с несколькими, запятыми. В ней будет тестовая запись.  ";
        text = text.trim();
        text = text.replaceAll(",", "");
        text = text.replaceAll("\\.", "");
        System.out.println(text);
        String[] words = text.split(" ");
        String resultText = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            resultText = resultText.concat(word.substring(word.length() - 1));
        }
        System.out.println("Получившееся слово через массив : " + resultText);

        String chars = "";
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if (symbol == ' ') {
                if (i != 0) {
                    chars = chars.concat(String.valueOf(text.charAt(i - 1)));
                }
            }
        }
        chars = chars.concat(text.substring(text.length() - 1));
        System.out.println("Получившееся слово используя цикл : " + chars);
    }
}
