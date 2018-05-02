package study.w3cschoool_two.java;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.nio.channels.SeekableByteChannel;
import java.util.Properties;

/**
 * Created by yaoxiang.sun on 2018/4/24.
 */
public class SendEmail {
    public static void main(String[] args) {
        String to = "yaoxiang.sun@datayes.com";
        String from = "yaoxiang.sun@datayes.com";
        String host = "idccellopoint.datayes.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
//        properties.setProperty("mail.user", "yaoxiang.sun@datayes.com");
//        properties.setProperty("mail.password", "Ak8971805");
        properties.setProperty("mail.host", host);
        properties.setProperty("mail.port", "25");
        properties.setProperty("mail.transport.protocol", "smtp");
        try {
            Session localSession = Session.getInstance(properties, new javax.mail.Authenticator() {
                // 在session中设置账户信息，Transport发送邮件时会使用
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("yaoxiang.sun@datayes.com", "Ak8971805");
                }
            });
            MimeMessage message = new MimeMessage(localSession);
//            Session session = Session.getDefaultInstance(properties);
//            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("标题??");
//            message.setText("正文部分");
//            message.setContent("<h1>wqeqwewqe</h1>","text/html");

            BodyPart messageBodyPart  = new MimeBodyPart();
            messageBodyPart.setText("This is part text");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            String filename = "tmp/employee.ser";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("发送成功");
        } catch (MessagingException msgerr) {
            msgerr.printStackTrace();
        }
    }
}
