public class Course {
    private String name;
    private int students;

    public Course(String name) {
        this.name = name;
    }

    public void addStudent() {
        students++;
    }

    public static void main(String[] args) {
        Course c = new Course("Object Oriented Programming");
        c.addStudent();
        c.addStudent();
        System.out.println(c.name + ": " + c.students + " students");
    }
}
