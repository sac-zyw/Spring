import com.sac.config.MyConfig;
import com.sac.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用配置类的方式去做，我们只能通过AnnotationConfigApplicationContext来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
