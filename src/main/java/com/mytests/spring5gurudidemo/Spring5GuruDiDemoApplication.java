package com.mytests.spring5gurudidemo;

import com.mytests.spring5gurudidemo.controllers.ConstructorInjectedController;
import com.mytests.spring5gurudidemo.controllers.MyController;
import com.mytests.spring5gurudidemo.controllers.PropertyInjectedController;
import com.mytests.spring5gurudidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5GuruDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5GuruDiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
