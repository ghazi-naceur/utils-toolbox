package gmail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by Ghazi Ennacer on 06/11/2017.
 */
public class GmailMailSender {


    public static void main(String args[]) {

        final String username = "source_address@gmail.com";
        final String password = "source_password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("source_address@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("destination_address@gmail.com"));
            message.setSubject("Gmail Example");
            message.setText("Hello There !");

            Transport.send(message);

            System.out.println("Mail sent succesfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
