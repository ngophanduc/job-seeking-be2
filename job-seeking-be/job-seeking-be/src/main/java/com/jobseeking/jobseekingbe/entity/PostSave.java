package com.jobseeking.jobseekingbe.entity;

import com.jobseeking.jobseekingbe.entity.keys.KeyPostCandidate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "post_save")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(KeyPostCandidate.class)
public class PostSave {

    @Id
    @Column(name = "user_id")
    String userId;

    @Id
    @Column(name = "post_id")
    int postId;
}
