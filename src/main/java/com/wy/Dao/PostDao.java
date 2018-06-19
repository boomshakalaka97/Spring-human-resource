package com.wy.Dao;

import com.wy.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends JpaRepository<Post,String> {
    Post save(Post post);
    void delete(Post post);
    Post findByPostId(String postId);
}
