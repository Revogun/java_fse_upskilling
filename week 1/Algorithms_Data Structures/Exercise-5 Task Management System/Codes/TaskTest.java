public class TaskTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Write report", "Pending"));
        manager.addTask(new Task(2, "Fix bug", "In Progress"));
        manager.addTask(new Task(3, "Team meeting", "Completed"));

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearch Task with ID 2:");
        System.out.println(manager.searchTask(2));

        System.out.println("\nDeleting Task with ID 1");
        manager.deleteTask(1);

        System.out.println("\nAll Tasks after Deletion:");
        manager.traverseTasks();
    }
}
