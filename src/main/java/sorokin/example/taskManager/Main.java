package sorokin.example.taskManager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("sorokin.example");

//        Task task = context.getBean(Task.class);
//        System.out.println(task);

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

//        Task task1 = context.getBean(Task.class);
//        Task task2 = context.getBean(Task.class);
//        System.out.println(task1 == task2);
//
        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.inProcess();
//
//        var taskProperties = context.getBean(TaskProperties.class);
//        System.out.println(taskProperties);

        context.close();
    }
}
