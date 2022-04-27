import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level;
        System.out.println("Enter task level");
        level = scan.nextInt();
        Task task = new Task("BackDev",
                "Moderate", "In Progress", level,
                "Medium", "2 days");
        Employee techlead = new TechLead();
        Employee developer = new Developer();
        Employee manager = new Manager();
        scan.close();
        if (task.taskLevel == 1) {
            task.openedBy(techlead);
            task.executedBy(developer);
        } else if (task.taskLevel == 2) {
            task.openedBy(manager);
            task.executedBy(techlead);
        } else if (task.taskLevel == 3) {
            task.openedBy(manager);
            task.executedBy(manager);
        }
    }
}
