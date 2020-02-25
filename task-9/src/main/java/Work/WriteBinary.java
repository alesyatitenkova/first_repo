package Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteBinary {

    public static void main(String[] args) throws IOException {
        final String fileName = "binary.tx";
        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            int val = (int) (Math.random() * 20);
            System.out.println(val);
            a.writeInt(val);
        }
        a.close();

        File file = new File(fileName);
        FileInputStream fileStream = new FileInputStream(file);
        DataInputStream input = new DataInputStream(fileStream);
        int intRead;
        List<Integer> numbers = new ArrayList<>();
        try {
            while ((intRead = input.readInt()) != -1) {
                numbers.add(intRead);
                System.out.println(intRead);
            }
        } catch (EOFException ignored) {
            System.out.println("[EOF]");
        }

        System.out.println("Average of numbers = " + numbers.stream().mapToInt(x -> x).average().getAsDouble());
        /*BufferedReader reader = new BufferedReader(input);

        String line;
        List<Integer> numbers = new ArrayList<>();
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }*/
    }
}
