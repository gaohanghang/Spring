package xing.rujuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-04-01 22:52
 **/
public class Main3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);

        emailService.sendEmail("test@gmail.com", "Hello from Miss Xing");
    }

}
