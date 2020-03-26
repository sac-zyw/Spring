import com.sac.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ShiAC
 * @date 2020/3/26
 */
public class MyTest {
    @Test
    public void test1(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        people.getDog().shout();
        people.getCat().shout();
    }
}
