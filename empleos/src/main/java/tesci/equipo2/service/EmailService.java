package tesci.equipo2.service;


import java.security.GeneralSecurityException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.sun.mail.util.MailSSLSocketFactory;

@Service
public class EmailService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private JavaMailSender sender;


	

	public boolean sendEmail(String from, String to,String subject,String  body) throws GeneralSecurityException {
		boolean send = false;
		SimpleMailMessage email = new SimpleMailMessage();
		
		
		try {
			email.setFrom(from);
			email.setTo(to);
	        email.setSubject(subject);
	        email.setText(body);
			sender.send(email);
			send = true;
			LOGGER.info("Mail enviado!");
		} catch (Exception e) {
			LOGGER.error("Hubo un error al enviar el mail: {}", e);
		}
		return send;
	}	
}