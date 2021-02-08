package personal.qcl.test.entity.generalEntity.generalEntityImp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;


public class peopleTest {
    @Test
    public void beanTest() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        People p1= (People) app.getBean(People.class);
        p1.eat();
        p1.eat();


      /*  Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(People.class);
        People people = new People(100,"李白",23);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("11111");
               Object o1= method.invoke(people,objects);
                System.out.println("11111");
                return o1;
            }

        });
    People people1 = (People) enhancer.create();
    people1.walk();*/

    }
}