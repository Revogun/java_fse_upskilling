public class TaskManager {
    TaskNode head = null;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.data.taskId == taskId) {
            head = head.next;
            return;
        }

        TaskNode temp = head;
        while (temp.next != null && temp.next.data.taskId != taskId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Task searchTask(int taskId) {
        TaskNode temp = head;
        while (temp != null) {
            if (temp.data.taskId == taskId) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void traverseTasks() {
        TaskNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
