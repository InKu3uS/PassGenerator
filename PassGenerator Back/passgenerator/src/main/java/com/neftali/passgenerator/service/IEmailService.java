package com.neftali.passgenerator.service;

import com.neftali.passgenerator.dto.EmailDTO;
import jakarta.mail.MessagingException;

public interface IEmailService {

    public void sendMail(EmailDTO emailDTO) throws MessagingException;

    public void sendExpirationWarning(String email, String name) throws MessagingException;

    public void checkExpirationAndSendEmail() throws MessagingException;
}
