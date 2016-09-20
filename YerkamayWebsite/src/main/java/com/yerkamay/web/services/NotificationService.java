package com.yerkamay.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yerkamay.web.commands.ConferenceCommand;
import com.yerkamay.web.commands.ContactCommand;


@Service
public class NotificationService {
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	Environment environment;
		
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
		
	public void sendContactNotification(ContactCommand contactCommand) throws MailException {
		
		StringBuilder message = new StringBuilder();
		
		message
			.append("Nombre: ").append(contactCommand.getName()).append("\n")
			.append("Correo electrónico: ").append(contactCommand.getEmail()).append("\n")
			.append("Teléfono: ").append(contactCommand.getPhone()).append("\n")
			.append("Mensaje: ").append(contactCommand.getMessage()).append("\n");
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
				
		simpleMailMessage.setTo(environment.getProperty("to"));
		simpleMailMessage.setFrom(environment.getProperty("from"));
		simpleMailMessage.setSubject(environment.getProperty("contact.subject"));
		simpleMailMessage.setText(message.toString());
		
		javaMailSender.send(simpleMailMessage);
		
	}
	
	public void sendConferenceNotification(ConferenceCommand conferenceCommand) throws MailException {
		
		StringBuilder message = new StringBuilder();
		
		message
			.append("Nombre: ").append(conferenceCommand.getName()).append("\n")
			.append("Teléfono: ").append(conferenceCommand.getPhone()).append("\n")
			.append("Correo electrónico: ").append(conferenceCommand.getEmail()).append("\n")
			.append("Organización / Iglesia: ").append(conferenceCommand.getOrganization()).append("\n")
			.append("Tipo de conferencia: ").append(conferenceCommand.getConferenceType()).append("\n")
			.append("Establecimiento: ").append(conferenceCommand.getPlace()).append("\n")
			.append("Equipo: ").append(conferenceCommand.getEquipment()).append("\n")
			.append("Mensaje: ").append(conferenceCommand.getMessage()).append("\n");
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		
		simpleMailMessage.setTo(environment.getProperty("to"));
		simpleMailMessage.setFrom(environment.getProperty("from"));
		simpleMailMessage.setSubject(environment.getProperty("conference.subject"));
		simpleMailMessage.setText(message.toString());
		
		javaMailSender.send(simpleMailMessage);
		
	}
	
}
