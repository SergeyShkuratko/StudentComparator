import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> tree = new TreeSet<>(new StipendComparator());
        tree.add(new Student("Aflred0",15,1200.0));
        tree.add(new Student("Aflred1",16,1600.0));
        tree.add(new Student("Aflred2",17,1300.0));
        tree.add(new Student("Aflred3",18,1250.0));
        Iterator<Student> it = tree.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
