import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rating26 {

    public static void main(String[] args) {
        int element = 5;
        int negative = 3;
        List<Integer> marks = new ArrayList<>(element);
        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);
            marks.add(a);
        }
        System.out.println(marks);
        Iterator<Integer> marksIterator = marks.iterator();
        while (marksIterator.hasNext()) {
            Integer mark  = marksIterator.next();
            if (mark <= negative) marksIterator.remove();;
        }
        System.out.println(marks);
    }
}
