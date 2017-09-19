public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double stipend;

    public Student(String name, int age, double stipend) {
        this.name = name;
        this.age = age;
        this.stipend = stipend;
    }

    public double getStipend() {
        return stipend;
    }

    @Override
    public int compareTo(Student student) {
        if (this.age < student.age) {
            return -1;
        } else if (this.age == student.age) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stipend=" + stipend +
                '}';
    }
}
