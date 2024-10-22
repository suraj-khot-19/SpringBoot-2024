package com.suraj.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
	// our every object is stored in a container in jvm and we can access them using "ApplicationContext"

		ApplicationContext context= SpringApplication.run(MyAppApplication.class, args);

		/*
		//	way to call a method from an object but using traditional java
		Dev obj=new Dev();
		obj.build();
		*/

		/*
		calling method using dependency injection
		 */

		Dev obj1=context.getBean(Dev.class);
		obj1.build();

		Laptop obj2=context.getBean(Laptop.class);
		obj2.hello();
	}

}
