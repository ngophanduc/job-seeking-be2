package com.jobseeking.jobseekingbe.repository;

import com.jobseeking.jobseekingbe.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> getAllByEmployerId(String userId);
    List<Post> findAllByPostStatusStatusTitle(String title);
}
