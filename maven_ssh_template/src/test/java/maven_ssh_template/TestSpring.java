package maven_ssh_template;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zehao.service.ITestService;

public class TestSpring {

	@Test
	public void test() {
		// 通过spring.xml配置文件创建Spring的应用程序上下文环境
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
		// 从Spring的IOC容器中获取bean对象
		ITestService iTestService = (ITestService) context.getBean("iTestService");
		// 执行测试方法
		iTestService.test();
	}
}