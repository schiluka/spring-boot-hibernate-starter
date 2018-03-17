package san.spring.boot.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author schiluka
 */

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello(String name) {
		System.out.println("====>>> HELLO " + name +"!  <<<===");

	}
}
