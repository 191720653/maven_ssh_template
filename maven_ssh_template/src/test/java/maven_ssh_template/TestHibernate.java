package maven_ssh_template;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zehao.model.Tests;
import com.zehao.service.ITestService;

public class TestHibernate {

	private ITestService iTestService;

	/**
	 * 这个before方法在所有的测试方法之前执行，并且只执行一次 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
	 * 比如在before方法里面初始化ApplicationContext和userService
	 */
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml", "spring-hibernate.xml" });
		iTestService = (ITestService) ac.getBean("iTestService");
	}

	@Test
	public void testSaveMethod() {
		// ApplicationContext ac = new ClassPathXmlApplicationContext(new
		// String[]{"spring.xml","spring-hibernate.xml"});
		// UserServiceI userService = (UserServiceI) ac.getBean("userService");
		Tests test = new Tests();
		test.setName("孤傲苍狼");
		test.setPwd("123");
		test.setActive(true);
		test.setCreateDateTime(new Date());
		Integer id = (Integer) iTestService.save(test);
		System.out.println(id);
	}
}