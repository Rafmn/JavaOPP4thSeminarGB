public class Task {
    private int id;
    private String nameTask;
    private String dateStart;
    private String timeStart;
    private String dateDeadline;
    private String fullName;
    private String priority;

    public Task(int id, 
                String nameTask, 
                String dateStart, 
                String timeStart,
                String dateDeadline, 
                String fullName,
                String priority) {
        this.id = id;
        this.nameTask = nameTask;
        this.dateStart = dateStart;
        this.timeStart = timeStart;
        this.dateDeadline = dateDeadline;
        this.fullName = fullName;
        this.priority = priority;
    }

    public String getTask() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", id, nameTask, dateStart, timeStart, dateDeadline, fullName, priority);
    }
}


