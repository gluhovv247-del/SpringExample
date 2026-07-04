package sorokin.example.taskManager;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component

public class Task {
    private String name;
    private Integer id;

    public Task(
            @Value("${task.name}") String name,
            @Value("${task.id}") Integer id
    ) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("task post construct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("task pre destroy");
    }
}
