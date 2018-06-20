package com.wy.Service;

import com.wy.Dao.PostDao;
import com.wy.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    PostDao postDao;

    public void addPost(Post post){
        try{
            postDao.save(post);
        }catch (Exception e){

        }
    }

    public void deletePost(Post post){
        try{
            postDao.delete(post);
        }catch (Exception e){

        }
    }

    public void updatePost(Post post){
        try{
            postDao.save(post);
        }catch (Exception e){

        }
    }

    public Post findPost(Post post){
        try{
            return postDao.findByPostId(post.getPostId());
        }catch(Exception e){
            return null;
        }
    }
}
