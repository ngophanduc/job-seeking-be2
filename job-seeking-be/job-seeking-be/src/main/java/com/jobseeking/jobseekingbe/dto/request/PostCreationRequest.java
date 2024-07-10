package com.jobseeking.jobseekingbe.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class PostCreationRequest {
    String position;
    String jobDetail;
    String email;
    String companyName;
    Long minSalary;
    Long maxSalary;
    Date endDate;
    String tech;
    String [] level;
    String [] jobType;
    String [] jobContract;
    String [] benefit;
    String [] progress;
    String [] role;
    String [] skill;
    String [] minimumYear;
}
