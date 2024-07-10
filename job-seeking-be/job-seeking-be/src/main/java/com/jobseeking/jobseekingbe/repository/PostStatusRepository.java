package com.jobseeking.jobseekingbe.repository;

import com.jobseeking.jobseekingbe.entity.PostStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostStatusRepository extends JpaRepository<PostStatus, Integer> {
    PostStatus findByStatusTitle(String title);
}
