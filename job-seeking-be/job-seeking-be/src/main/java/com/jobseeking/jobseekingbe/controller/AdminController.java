package com.jobseeking.jobseekingbe.controller;

import com.jobseeking.jobseekingbe.dto.ApiResponse;
import com.jobseeking.jobseekingbe.dto.request.AdminRemoveUserRequest;
import com.jobseeking.jobseekingbe.entity.User;
import com.jobseeking.jobseekingbe.service.AdminService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class AdminController {

    AdminService adminService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = adminService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId) {
        Optional<User> user = adminService.getUserById(userId);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/users")
    public ResponseEntity<ApiResponse<String>> removeUser(@RequestBody AdminRemoveUserRequest removeUserRequest) {
        adminService.removeUser(removeUserRequest.getUserId());
        return ResponseEntity.ok(
                ApiResponse.<String>builder()
                        .result("User removed successfully")
                        .build()
        );
    }


}
