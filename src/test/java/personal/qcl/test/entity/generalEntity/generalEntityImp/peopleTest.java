package personal.qcl.test.entity.generalEntity.generalEntityImp;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class peopleTest {
    @Test
    public void beanTest() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        People p1= (People) app.getBean("people");
        System.out.println(p1);
        p1.walk();
        p1.eat();
        p1.eat();
        p1.eat();
        /*EnhancePeopleBehaviorImp i1= (EnhancePeopleBehaviorImp)app.getBean("myAspect");
        System.out.println(i1.s1);*/


    }
}