package saritasmesutng.spring_basic_example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mesut.saritas
 */
@ComponentScan
@Configuration
public class ApplicationConfiguration {

	@Bean
	public HelloWorld getMessageService() {
		return new HelloWorldImpl();
	}
}
