package xing.rujuan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xing.rujuan.config.AppConfig;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-04-01 22:52
 **/
public class Main4 {

    public static void main(String[] args) {
        // xml获取实例
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);
        System.out.println(emailService);
        emailService.sendEmail("test@gmail.com", "Hello from Miss Xing");

        // java Config Class 获取实例
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService1 = context1.getBean("emailService", EmailService.class);
        System.out.println(emailService1);
        emailService1.sendEmail("test@gmail.com", "Hi");
    }

}
