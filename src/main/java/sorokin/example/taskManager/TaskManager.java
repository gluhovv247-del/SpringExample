package sorokin.example.taskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sorokin.example.aop.Loggable;

@Component
public class TaskManager {
    private final Task task;
    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }
    @Loggable
    public Integer printTask(){
        System.out.println("Current task: " + task.toString());
//        throw new RuntimeException("Exception in Task Manager");
        return task.getId();
    }
}
