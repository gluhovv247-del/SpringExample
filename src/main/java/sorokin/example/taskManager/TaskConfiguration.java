//package sorokin.example.beans.taskManager;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class TaskConfiguration {
//    @Bean("main-task")
//    @Scope("prototype")
//    @Primary
//    public Task task(){
//        return new Task();
//    }
//
////    @Bean("not-main-task")
////    public Task task2(){
////        return new Task();
////    }
//
//    @Bean
//    public TaskManager taskManager(
//            Task task
//    ){
//        return new TaskManager(task);
//    }
//    @Bean
//    public TaskExecutor taskExecutor(Task task){
//        return new TaskExecutor(task);
//    }
//}
