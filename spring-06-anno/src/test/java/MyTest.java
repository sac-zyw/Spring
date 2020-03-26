import com.sac.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
public class MyTest {
    public static void main(String[] args) {
      ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
}
