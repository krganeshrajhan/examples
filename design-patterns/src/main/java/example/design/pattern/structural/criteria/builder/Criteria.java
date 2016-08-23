package example.design.pattern.structural.criteria.builder;

import example.design.pattern.structural.criteria.person.Person;

import java.util.List;

/**
 * Created by 1532082 on 7/21/2016.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}