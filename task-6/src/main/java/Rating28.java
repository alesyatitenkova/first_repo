import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rating28 {

    public static void main(String[] args) {
        int element = 10;
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            int a = (int)(Math.random() * 10 + 1);
            marks.add(a);
        }
        System.out.println(marks);
        int max = marks.get(0);
        for (Integer mark : marks) {
            if (max <= mark) {
                max = mark;
            }
        }
        for (Iterator<Integer> it = marks.iterator(); it.hasNext();) {
            Integer mark = it.next();
            if (mark < max) {
                it.remove();
            }
        }
        System.out.println(marks);
        System.out.println(max);
    }
}
