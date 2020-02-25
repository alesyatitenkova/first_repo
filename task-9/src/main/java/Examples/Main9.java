package Examples;

import java.io.Console;

public class Main9 {
    public static void main (String[] args) {
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        String s = c.readLine();
        char [] pass = c.readPassword();
    }
}
