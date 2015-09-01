package maven_ssh_template;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zehao.model.Tests;
import com.zehao.service.ITestService;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		before();
		testSaveMethod();
	}

	private static ITestService iTestService;

	/**
	 * 这个before方法在所有的测试方法之前执行，并且只执行一次 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
	 * 比如在before方法里面初始化ApplicationContext和userService
	 */
	public static void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml", "spring-hibernate.xml" });
		iTestService = (ITestService) ac.getBean("iTestService");
	}

	public static void testSaveMethod() throws UnsupportedEncodingException {
		// ApplicationContext ac = new ClassPathXmlApplicationContext(new
		// String[]{"spring.xml","spring-hibernate.xml"});
		// UserServiceI userService = (UserServiceI) ac.getBean("userService");
		// test.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		Tests test = new Tests();
		test.setName(new String("孤傲苍狼".getBytes(), "UTF-8"));
		test.setPwd("123");
		test.setActive(true);
		test.setCreateDateTime(new Date());
		Integer id = (Integer) iTestService.save(test);
		System.out.println(id);
	}
}
