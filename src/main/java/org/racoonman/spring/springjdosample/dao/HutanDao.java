package org.racoonman.spring.springjdosample.dao;

import org.racoonman.spring.springjdosample.model.Person;
import java.util.List;

/**
 *
 * @author daniel
 */
public interface HutanDao {
    List<Person> getPersons();

    public void savePerson(Person c);
}
