package com.bibliotheque.Service;


import com.bibliotheque.configuration.MyConstant;
import com.bibliotheque.models.Utilisateur;
import com.bibliotheque.proxies.ProxyBatchToBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    ProxyBatchToBack proxyBatchToBack;

    @Autowired
    public JavaMailSender emailSender;


    @Override
    public List<Utilisateur> listeMembreEnRetard() {
        List<Utilisateur> utilisateurEnRetard = proxyBatchToBack.listeDesUtilisateursEnRetard();

        return utilisateurEnRetard;
    }
    // creation sendmail dans service liste resa enretard et mail a tous els retardataire

    @ResponseBody
    @RequestMapping("/sendSimpleEmail")
    public String sendMaill() {
// Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(MyConstant.FRIEND_EMAIL);
        message.setSubject("Test Simple Email");
        message.setText("Hello, Im testing Simple Email");

        // Send Message!
        this.emailSender.send(message);

        return "Email Sent!";

    }
}
