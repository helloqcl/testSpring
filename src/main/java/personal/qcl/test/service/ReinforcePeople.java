package personal.qcl.test.service;

import personal.qcl.test.entity.generalEntity.generalEntityImp.People;

/*
* reinforce
* 增强/削弱人的行为
* */
public interface ReinforcePeople {
    Object reinforce(People people);
    Object weaken(People people);
}
