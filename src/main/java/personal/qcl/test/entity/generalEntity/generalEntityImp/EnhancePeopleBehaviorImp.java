package personal.qcl.test.entity.generalEntity.generalEntityImp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("enhance")
@Aspect
public class EnhancePeopleBehaviorImp {
    @Before("execution (* personal.qcl.test.entity.generalEntity.generalEntityImp.People.eat())")
    public void before() {

        System.out.println("this is before");
    }
    public void after() {

        System.out.println("this is after");
    }
    public void around() {

        System.out.println("this is around");
    }

}
