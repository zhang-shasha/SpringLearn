import com.hbuas.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //根据bean的id获取bean
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.getStr());
    }
}
