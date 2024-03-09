package com.stats.StatisticProject.service.impl;

import com.stats.StatisticProject.service.EmailService;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Value("${spring.mail.username}")
    private String fromMail;


    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public String sendMailTo(String to, String body) {
        try{

            MimeMessage mimeMessage = javaMailSender.createMimeMessage();

            MimeMessageHelper mimeMessageHelper= new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setFrom(fromMail);
            mimeMessageHelper.setTo(to);
//            mimeMessageHelper.setCc(""); if you need...
            mimeMessageHelper.setSubject("Your tennis stats");
            mimeMessageHelper.setText(body);

//            for (int i = 0; i < file.length ; i++) {
//                mimeMessageHelper.addAttachment(
//                        file[i].getOriginalFilename(),
//                        new ByteArrayResource(file[i].getBytes())
//                );
//            }
            javaMailSender.send(mimeMessage);

            return "Mail was sent to " + to+" with message: " + body;

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getEmail(String name) {

        if(name.equals("Junya"))return "999.haha.990@gmail.com";
        if(name.equals("Bahdan"))return "dtnbah@gmail.com";
        if(name.equals("nzar"))return "haarukaakuru@gmail.com";
        else throw new IllegalArgumentException("IDI NAHUI " + name);
    }

}
