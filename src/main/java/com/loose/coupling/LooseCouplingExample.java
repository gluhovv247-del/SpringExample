package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");
        UserManager userManagerDatabase = (UserManager) context.getBean("IoCDatabase");
        UserManager userManagerWebservice = (UserManager) context.getBean("IoCWebservice");
        System.out.println(userManagerDatabase.getUserInfo());
        System.out.println(userManagerWebservice.getUserInfo());
    }
}
