package personal.qcl.test.entity.generalEntity.generalEntityImp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import personal.qcl.test.entity.generalEntity.EnhancePeopleBehavior;

@Component("myAspect")
@Aspect
public class EnhancePeopleBehaviorImp implements EnhancePeopleBehavior {
    @Value("123")
    String s1;
    //before
    @Before("execution(void personal.qcl.test.entity.generalEntity.generalEntityImp.People.eat()))")
    public void before() {
        System.out.println("before------------------------------------------");
    }

    //after

    public People after(People people) {
        System.out.println("after");
        return people;
    }
}
