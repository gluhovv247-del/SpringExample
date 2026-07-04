package sorokin.example.taskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sorokin.example.aop.Loggable;

@Component
public class TaskExecutor {
    private Task task;

    @Autowired
    public TaskExecutor(Task task) {
        this.task = task;
    }
    @Loggable(value = "ERROR",
                quantity = 2)
    public void inProcess(){
        System.out.println("Я короче ща вот эту задачу говнякаю братик: " + task);
    }
}
