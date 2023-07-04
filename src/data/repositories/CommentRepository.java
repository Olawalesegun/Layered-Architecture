package data.repositories;

import data.models.Comment;

public interface CommentRepository {

    Comment save(Comment comment);
    Comment findById(int id);
    void delete(Comment comment);
    void delete(int id);
    void deleteAll();
    long count();
}
