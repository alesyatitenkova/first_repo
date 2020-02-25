package Examples;

import java.util.Scanner;

public class Main6 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n"+"Люблю твой строгий, стройный вид,\n"+
    "Невы державное течение,\n"+"Береговой ее гранит");

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }
    }
}
