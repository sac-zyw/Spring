import com.sac.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       //我们的对象现在都在spring中管理了，我们要使用直接去里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());


    }
}
