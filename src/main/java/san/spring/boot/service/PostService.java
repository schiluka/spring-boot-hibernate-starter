package san.spring.boot.service;

import san.spring.boot.model.Post;

/**
 * 
 * @author schiluka
 */

public interface PostService {

    public void printAllPosts();

    public void addPosts(int rows);
 
    public void deletePosts();
}
