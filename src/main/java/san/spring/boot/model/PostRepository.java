package san.spring.boot.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author schiluka
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}