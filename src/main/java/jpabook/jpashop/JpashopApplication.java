package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setName("Hero");
		String data = hello.getName();

		System.out.println("data = " + data);

		SpringApplication.run(JpashopApplication.class, args);
	}

}
