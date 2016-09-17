import com.spring.ch03.A;
import com.spring.ch03.SpringAnnotate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by geethakalluri on 9/15/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {SpringAnnotate.class})
public class SpringAnnotateTest {

    @Autowired
    private A a;

    @Test
    public void checkA(){ a.checkBAlive();}



}
