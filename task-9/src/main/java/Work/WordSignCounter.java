package Work;

import java.io.*;
import java.util.regex.Pattern;

public class WordSignCounter {

    public static void main(String[] args) throws IOException {
        String path = "task-9/src/main/resources/words.txt";
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;
        int countWord = 0;
        int punctuationCount = 0;
        final Pattern p = Pattern.compile("[,.?!:;]");
        while((line = reader.readLine()) != null)
        {
            if(!(line.equals("")))
            {
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
                punctuationCount += p.splitAsStream(line).count();
            }
        }
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of punctuation signs = " + punctuationCount);
    }
}
