import com.sac.dao.UserDaoMysqlImpl;
import com.sac.dao.UserDaoOrcalImpl;
import com.sac.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext：拿到spring的容器
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //需要什么，就获取什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
