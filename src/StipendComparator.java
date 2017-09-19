import java.util.Comparator;

public class StipendComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getStipend() < o2.getStipend()) {
            return -1;
        } else if (o1.getStipend() == o2.getStipend()) {
            return 0;
        } else {
            return 1;
        }
    }
}
