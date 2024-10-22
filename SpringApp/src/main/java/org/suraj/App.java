package org.suraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*
        tradition way to call dev's method
        Dev obj=new Dev();
        obj.build();
         */

        //creating a container inside a jvm to store an objects like spring do
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //use bean here
        // Dev obj = context.getBean(Dev.class);

        /*
        instead of writing Dev.class we can write "dev" cause of
             <bean id="dev" class="org.suraj.Dev"> this here we declared dev as id just do type casting
         */
        Dev obj = (Dev) context.getBean("dev");
        obj.build();


        //ex2
        Laptop laptop=(Laptop) context.getBean("lap");
        laptop.coding();

        // injection
        obj.setAge(15);
        System.out.println("age using dev id:"+obj.getAge());

        Dev obj2=(Dev) context.getBean("dev2");
        System.out.println("age using dev2 id:"+obj2.getAge());
    }
}
