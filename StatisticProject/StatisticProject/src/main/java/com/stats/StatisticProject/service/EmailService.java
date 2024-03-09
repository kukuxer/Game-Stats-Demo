package com.stats.StatisticProject.service;

import org.springframework.web.multipart.MultipartFile;

public interface EmailService {
    String sendMailTo(String to, String body);
    String getEmail(String name);
}
