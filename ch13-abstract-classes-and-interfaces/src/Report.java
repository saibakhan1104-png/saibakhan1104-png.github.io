public class Report implements Printable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Report: " + title);
    }

    public static void main(String[] args) {
        Printable report = new Report("Java OOP Report");
        report.print();
    }
}
