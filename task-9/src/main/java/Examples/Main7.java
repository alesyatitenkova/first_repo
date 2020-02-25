package Examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main7 {

    public static void main (String[] args) {

        String dataPath = "D:/Alesya_coures/Варивнт 1/data.docx";
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(dataPath)));
            //s = new Scanner (new File(dataPath));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (s !=null){
                s.close();
            }
        }
    }
}
