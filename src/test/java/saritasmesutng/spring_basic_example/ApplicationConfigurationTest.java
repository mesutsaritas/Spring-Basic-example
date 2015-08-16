package saritasmesutng.spring_basic_example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mesut.saritas
 */
public class ApplicationConfigurationTest {

	public ApplicationConfigurationTest() {
	}

	@Test
	public void test() {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);

		MessageService messageService = applicationContext
				.getBean(MessageService.class);

		messageService.printOutMessage();

	}

}
