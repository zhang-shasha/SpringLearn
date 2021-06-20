import com.hbuas.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        userServiceImpl.getUsers();
    }
}
