package personal.qcl.test.entity.generalEntity;

import personal.qcl.test.entity.generalEntity.generalEntityImp.People;
public interface EnhancePeopleBehavior {
    //before
    void before();
    //after
    People after(People people);
}
