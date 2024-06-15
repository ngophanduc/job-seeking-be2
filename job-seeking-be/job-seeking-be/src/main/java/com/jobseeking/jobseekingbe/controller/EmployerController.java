package com.jobseeking.jobseekingbe.controller;

import com.jobseeking.jobseekingbe.entity.Employer;
import com.jobseeking.jobseekingbe.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @PutMapping("/{id}")
    public ResponseEntity<Employer> updateEmployer(@PathVariable String id, @RequestBody Employer updatedEmployer) {
        Optional<Employer> employer = employerService.updateEmployer(id, updatedEmployer);
        return employer.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
