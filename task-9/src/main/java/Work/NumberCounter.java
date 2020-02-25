package Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCounter {

    public static void main(String[] args) throws IOException {
        String path = "task-9/src/main/resources/numbers.txt";
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        List<Integer> numbers = new ArrayList<>();
        int countNumbers = 0;
        Pattern p = Pattern.compile("\\d+");
        String line;
        while((line = reader.readLine()) != null) {
            if(!(line.equals(""))) {
                Matcher m = p.matcher(line);
                while(m.find()) {
                    countNumbers++;
                    numbers.add(Integer.valueOf(m.group()));
                }
            }
        }
        numbers.forEach(System.out::println);
        System.out.println("Total count of numbers = " + countNumbers);
        System.out.println("Sum of numbers = " + numbers.stream().mapToInt(x -> x).sum());
        System.out.println("Sum of distinct = " + numbers.stream().distinct().mapToInt(x -> x).sum());
    }
}
