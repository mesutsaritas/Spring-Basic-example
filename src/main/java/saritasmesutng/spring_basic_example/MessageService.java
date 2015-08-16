package saritasmesutng.spring_basic_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mesut.saritas
 */
@Component
public class MessageService {

	@Autowired
	private HelloWorld helloWorldService;

	public void printOutMessage() {
		System.out.println(this.helloWorldService.getMessage());
	}
}
