package com.jobseeking.jobseekingbe.service;

import com.jobseeking.jobseekingbe.dto.request.AdminRemoveUserRequest;
import com.jobseeking.jobseekingbe.entity.User;
import com.jobseeking.jobseekingbe.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Transactional
    public void removeUser(String userId) {
        userRepository.deleteById(userId);
    }
}
