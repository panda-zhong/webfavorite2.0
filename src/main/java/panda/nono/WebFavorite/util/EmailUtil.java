package panda.nono.WebFavorite.util;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.junit.Test;

public class EmailUtil {
	public synchronized  static void sendCodeEmail(String to,String code) throws MessagingException{
		Properties properties = new Properties();
		properties.setProperty("mail.smtp.host", "smtp.163.com"); 
		properties.setProperty("mail.smtp.auth", "true");
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("13433615241@163.com", "qq123456");
			}
		});
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("13433615241@163.com"));
		message.setRecipient(RecipientType.TO, new InternetAddress(to));
		message.setSubject("找回密码验证码");
//		String activeHerf = EMailTool.domain+
		message.setContent("你好，你的验证码是"+code, "text/html;charset=UTF-8");
		Transport.send(message);
	}

	public static void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	
}
