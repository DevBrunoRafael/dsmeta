package com.devbrunorafael.dsmeta.components.emails;

import com.devbrunorafael.dsmeta.config.EmailConfig;
import com.devbrunorafael.dsmeta.entities.Sale;
import com.devbrunorafael.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailsService {

    @Autowired
    private SaleRepository repository;

    public void sendMail(Long id){

        Sale sale = this.repository.findById(id).get();

        try {

            Properties props = System.getProperties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(
                    props, new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(EmailConfig.USER, EmailConfig.PASSWORD);
                        }
                    }

            );

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(EmailConfig.sender));

            Address[] recipients = InternetAddress
                    .parse(EmailConfig.recipient);

            message.setRecipients(Message.RecipientType.TO, recipients);
            message.setSubject(EmailConfig.subject);

            String text = "Parabéns " + sale.getSellerName() +
                    "\nvocê bombou nas vendas esse mês, por isso acaba de receber um aumento no salário";

            message.setText(text); // configurar como parâmetro

            System.out.println("enviando ...");

            Transport.send(message);

            System.out.println("Email enviado." + "\nVerifique sua caixa de entrada e spam.");

        } catch (MessagingException e) {
//            e.printStackTrace();
            System.out.println("Erro de conexão");
        }

    }
}
