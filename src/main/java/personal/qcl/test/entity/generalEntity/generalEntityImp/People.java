package personal.qcl.test.entity.generalEntity.generalEntityImp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import personal.qcl.test.entity.generalEntity.PeopleBehavior;

import java.util.List;
import java.util.Map;

/*a test class:people
 * .people attribute
 * 'constructor
 * .getterAndSetter 构造器
 * .people behavior
 * .toString
 * */
@Component("people")
public class People implements PeopleBehavior {

    //people attribute
    @Value("001")
    private int pId;
    @Value("李白")
    private String pName = "张三";
    @Value("19")
    private int age;
    private List<String> kinshipList;
    private Map<String,People> peopleMap ;
    //constructor

    public People(int pId, String pName, int age) {
        this.pId = pId;
        this.pName = pName;
        this.age = age;
    }

    public People() {
    }
//getterAndSetter 构造器

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getKinshipList() {
        return kinshipList;
    }

    public void setKinshipList(List<String> kinshipList) {
        this.kinshipList = kinshipList;
    }

    public Map<String, People> getPeopleMap() {
        return peopleMap;
    }

    public void setPeopleMap(Map<String, People> peopleMap) {
        this.peopleMap = peopleMap;
    }

    //people behavior
    @Override

    public Object eat() {
        System.out.println(this.pName + "is eatting");
        return this;
    }

    @Override
    public Object run() {
        System.out.println(this.pName + "is running");
        return this;
    }

    @Override
    public Object walk() {
        System.out.println(this.pName + "is walking");
        return this;
    }

    @Override
    public Object relax() {
        return null;
    }

    @Override
//    toString
    public String toString() {
        return "people{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", age=" + age +
                '}';
    }
}
