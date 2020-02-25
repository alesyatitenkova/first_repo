package Examples;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2 {
    public static void main (String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        while (true) {
            int x =reader.read();
            System.out.println(x);
        }
    }
}
