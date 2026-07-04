package sorokin.example.taskManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TaskProperties {
    @Value("${task.name}")
    private String taskName;

    @Value("${task.id}")
    private int taskId;

    @Value("#{'${list.values}'.split(',')}")
    private List<String> listValues;

    @Value("#{${map.values}}")
    private Map<String, Integer> mapValues;

    @Override
    public String toString() {
        return "TaskProperties{" +
                "taskName='" + taskName + '\'' +
                ", taskId=" + taskId +
                ", listValues=" + listValues +
                ", mapValues=" + mapValues +
                '}';
    }
}
