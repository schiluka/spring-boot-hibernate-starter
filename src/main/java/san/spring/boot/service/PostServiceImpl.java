package san.spring.boot.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import san.spring.boot.model.Post;
import san.spring.boot.model.PostRepository;

/**
 * 
 * @author schiluka
 */

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostRepository postRepository;
	
	@Override
    public void printAllPosts() {
		List<Post> posts = postRepository.findAll();
		for(Post post : posts) {
			System.out.println(post);
		}
	}

	@Override
    public void addPosts(int rows) {
		for(int i=1;i<=rows;i++) {
			Post post = createPost(i);
			postRepository.save(post);
		}
		System.out.println("===>  All posts inserted  <===");
    }
    
	@Override
	public void deletePosts() {
		postRepository.deleteAll();
		System.out.println("===>  All posts deleted  <===");
	}
	
	private Post createPost(int i) {
		Post post = new Post();
		post.setId(i);
		post.setAuthor("schiluka");
		post.setTitle("Post Title");
		post.setBody("Body");
		post.setCreationDate(Calendar.getInstance().getTime());
		post.setPublished(1);
		
		return post;
		
	}
}
