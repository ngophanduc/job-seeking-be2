package com.jobseeking.jobseekingbe.service;

import com.jobseeking.jobseekingbe.entity.Employer;
import com.jobseeking.jobseekingbe.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    public Optional<Employer> updateEmployer(String id, Employer updatedEmployer) {
        return employerRepository.findById(id).map(employer -> {
            employer.setAvatar(updatedEmployer.getAvatar());
            employer.setCompanyName(updatedEmployer.getCompanyName());
            employer.setWebsite(updatedEmployer.getWebsite());
            employer.setAbout(updatedEmployer.getAbout());
            employer.setAddress(updatedEmployer.getAddress());
            employer.setFacebook(updatedEmployer.getFacebook());
            employer.setLinkedin(updatedEmployer.getLinkedin());
            employer.setLocation(updatedEmployer.getLocation());
            employer.setPro_id(updatedEmployer.getPro_id());
            // Nếu cần cập nhật các bài post, có thể thêm logic tại đây
            return employerRepository.save(employer);
        });
    }
}
