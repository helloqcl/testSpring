package personal.qcl.test.service.serviceImp;

import personal.qcl.test.entity.generalEntity.generalEntityImp.People;
import personal.qcl.test.service.ReinforcePeople;
/*
* 人的增强/削弱的实现
* */
public class ReinforcePeopleC implements ReinforcePeople {
    @Override
    public Object weaken(People people) {
        int a = people.getAge();
        people.setAge(1);
        System.out.println("我"+people+"被增强了年龄"+(people.getAge()-a));
        return people;
    }

    @Override
    public Object reinforce(People people) {
        int a = people.getAge();
        people.setAge(155);
        System.out.println("我"+people+"被增强了年龄"+(people.getAge()-a));
        return people;
    }
}
