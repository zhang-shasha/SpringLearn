import com.hbuas.pojo.Student;
import com.hbuas.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void PNameSpaceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user = context.getBean("user",User.class);
        User user2 = context.getBean("user2",User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    }



}
