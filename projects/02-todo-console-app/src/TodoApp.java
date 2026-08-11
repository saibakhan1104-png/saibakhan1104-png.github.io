import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    static class Task {
        String title;
        boolean completed;

        Task(String title) {
            this.title = title;
        }

        public String toString() {
            return (completed ? "[x] " : "[ ] ") + title;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add  2. List  3. Complete  4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Task: ");
                tasks.add(new Task(sc.nextLine()));
            } else if (choice == 2) {
                for (int i = 0; i < tasks.size(); i++)
                    System.out.println((i + 1) + ". " + tasks.get(i));
            } else if (choice == 3) {
                System.out.print("Task number: ");
                int index = sc.nextInt() - 1;
                if (index >= 0 && index < tasks.size())
                    tasks.get(index).completed = true;
            } else {
                break;
            }
        }
        sc.close();
    }
}
