package data.repositories;

import data.models.Post;

import java.util.List;

public interface PostRepository {
    List<Post> findAll();
    Post save(Post post);
    Post findById(int id);
    void delete(Post post);
    void deleteAll();
    long count();
}
