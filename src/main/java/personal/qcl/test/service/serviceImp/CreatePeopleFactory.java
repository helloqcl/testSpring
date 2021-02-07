package personal.qcl.test.service.serviceImp;

import personal.qcl.test.entity.generalEntity.generalEntityImp.People;
import personal.qcl.test.service.MakePerson;

import java.util.ArrayList;
import java.util.List;

public class CreatePeopleFactory implements MakePerson {


    @Override
    public Object makeNewPeopleInstance() {
        return new People();
    }
    public List<People> makeNewPeopleList(){
        List<People> arrayList = new ArrayList<People>();
        return arrayList;
    }
}
