package com.jobseeking.jobseekingbe.controller;

import com.jobseeking.jobseekingbe.entity.Candidate;
import com.jobseeking.jobseekingbe.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PutMapping("/{id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable String id, @RequestBody Candidate updatedCandidate) {
        Optional<Candidate> candidate = candidateService.updateCandidate(id, updatedCandidate);
        return candidate.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
