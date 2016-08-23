package example.design.pattern.structural.criteria.builder;

import example.design.pattern.structural.criteria.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1532082 on 7/21/2016.
 */
public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
