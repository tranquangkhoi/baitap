package Blog;

import java.util.ArrayList;
import org.springframework.util.CollectionUtils;

/**
 * @author tranquangkhoi
 */
public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;
   private ArrayList<Comment> comments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void loadPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
   
}
