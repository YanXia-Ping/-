package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.StudentService;


public class TestSpring {

	@Test
	public void run1() {
		//加载Spring配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		//获取对象
		StudentService accountService  = (StudentService)ac.getBean("studentService");
		//调用方法
		accountService.findAll();
	}
}
