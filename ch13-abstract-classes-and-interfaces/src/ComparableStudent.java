public class ComparableStudent implements Comparable<ComparableStudent> {
    private String name;
    private double cgpa;

    public ComparableStudent(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(ComparableStudent other) {
        return Double.compare(cgpa, other.cgpa);
    }

    public static void main(String[] args) {
        ComparableStudent a = new ComparableStudent("A", 3.50);
        ComparableStudent b = new ComparableStudent("B", 3.75);
        System.out.println(a.compareTo(b));
    }
}
