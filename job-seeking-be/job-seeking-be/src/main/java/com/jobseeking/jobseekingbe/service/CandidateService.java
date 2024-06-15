package com.jobseeking.jobseekingbe.service;

import com.jobseeking.jobseekingbe.entity.Candidate;
import com.jobseeking.jobseekingbe.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public Optional<Candidate> updateCandidate(String id, Candidate updatedCandidate) {
        return candidateRepository.findById(id).map(candidate -> {
            candidate.setAvatar(updatedCandidate.getAvatar());
            candidate.setDob(updatedCandidate.getDob());
            candidate.setPosition(updatedCandidate.getPosition());
            candidate.setCurrentSalary(updatedCandidate.getCurrentSalary());
            candidate.setSelfDesc(updatedCandidate.getSelfDesc());
            candidate.setGender(updatedCandidate.getGender());
            candidate.setAge(updatedCandidate.getAge());
            candidate.setSalaryExpect(updatedCandidate.getSalaryExpect());
            candidate.setFacebook(updatedCandidate.getFacebook());
            candidate.setLinkedin(updatedCandidate.getLinkedin());
            candidate.setLocation(updatedCandidate.getLocation());
            return candidateRepository.save(candidate);
        });
    }
}
