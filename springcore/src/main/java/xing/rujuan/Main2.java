package xing.rujuan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2021-04-01 22:44
 **/
public class Main2 {

    public static void main(String[] args) {
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = beanFactory.getBean("emailService", EmailService.class);

        emailService.sendEmail("test@gmail.com", "Hello from Miss Xing");
    }

}
