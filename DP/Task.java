
public class Task {
    String taskName;
    String taskType;
    String taskStatus;
    int taskLevel;
    String taskSize;
    String effortRequired;

    public Task() {
        taskName = "Task1";
        taskType = "TaskType1";
        taskStatus = "TaskStatus1";
        taskLevel = 1;
        taskSize = "TaskSize1";
        effortRequired = "EffortRequired1";
    }

    public Task(String taskName, String taskType, String taskStatus, int taskLevel, String taskSize,
            String effortRequired) {
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
        this.taskLevel = taskLevel;
        this.taskSize = taskSize;
        this.effortRequired = effortRequired;
    }

    public void executedBy(Employee employee) {
        employee.executedBy();
    }

    public void openedBy(Employee employee) {
        employee.openedBy();
    }
}
