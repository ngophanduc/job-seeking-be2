package com.jobseeking.jobseekingbe.service;


import com.jobseeking.jobseekingbe.entity.Employer;
import com.jobseeking.jobseekingbe.service.imp.EmployerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class EmailService implements EmployerServiceImp {

    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setFrom("mailtrap@demomailtrap.com");
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
    }

    @Override
    public Employer getEmployer(String email) {
        return null;
    }
}
