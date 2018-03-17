package san.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import san.spring.boot.service.HelloService;
import san.spring.boot.service.PostService;

/**
 * 
 * @author schiluka
 */

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private HelloService helloService;

	@Autowired
	private PostService postService;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		helloService.sayHello("San");
		int numOfRows = new Integer(arg0[0]);
		postService.addPosts(numOfRows);
		postService.printAllPosts();
		postService.deletePosts();
	}

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	public PostService getPostService() {
		return postService;
	}

	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	
}