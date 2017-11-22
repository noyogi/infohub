/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Utils.MailSender;
import Utils.SMSSender;
import javax.mail.MessagingException;
import javax.mail.Session;

/**
 *
 * @author gotzwinterfeldt
 */
public class TestMail {

    public static void main(String[] args) {

        try {
            MailSender send = new MailSender();
            Session s = send.getGMailSession("mail@dit.education", "Mail2017+1");

            send.postMail(s, "goetz.winterfeldt@th-deg.de", "nix", "nix");
            
            SMSSender.sendSMS("und tschuees");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
