package xing.rujuan;

/**
 * @Description 不用Spring之前
 * @Author Gao Hang Hang
 * @Date 2021-04-01 22:41
 **/
public class Main1 {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("test@gmail.com", "Hello from Miss Xing");
    }

}
