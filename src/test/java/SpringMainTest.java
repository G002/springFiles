import com.spring.ch03.A;
import com.spring.ch03.B;
import com.spring.ch03.SpringAnnotate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by geethakalluri on 9/14/16.
 */
public class SpringMainTest {

    public static void main(String [] args){

     /*  ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/spring-annotation.xml"});
*/

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:META-INF/spring/spring-annotation.xml");
       A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");

  //      b.execute();
        a.checkBAlive();

        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(SpringAnnotate.class);

        a = (A) annotationConfigApplicationContext.getBean("a");

        System.out.println("Testing via annotaion config");
        a.checkBAlive();
    }
}
