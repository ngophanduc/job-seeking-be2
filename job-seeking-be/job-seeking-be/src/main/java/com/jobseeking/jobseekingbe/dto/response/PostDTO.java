package com.jobseeking.jobseekingbe.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostDTO {
    int postId;
    byte[] image;
    byte[] background;
    String status;
    String title;
    String desc;
    String companyName;
    String location;
    String expiredDate;
    String salary;
    List<PostLevelDTO> levels;
    List<PostTypeDTO> types;
    List<PostContractDTO> contracts;
    PostRequirementDTO postRequirementDTO;
    String tech;
}
