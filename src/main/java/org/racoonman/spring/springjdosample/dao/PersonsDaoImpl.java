package org.racoonman.spring.springjdosample.dao;

import org.racoonman.spring.springjdosample.model.Person;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author daniel
 */
@Transactional
@Component
//@Repository
public class PersonsDaoImpl implements PersonsDao {
    
    @Autowired
    @Qualifier("pmfTransactionAware")
    private PersistenceManagerFactory pmf;
    
    public void setPersistenceManagerFactory(PersistenceManagerFactory pmf){
        this.pmf = pmf;
    }

    @Override
    public List<Person> getPersons() {
        PersistenceManager pm = pmf.getPersistenceManager();
        Query q = pm.newQuery(Person.class);
        List<Person> list = (List<Person>) q.execute();
        return list;
    }

    @Override
    public void savePerson(Person p) {
        PersistenceManager pm = pmf.getPersistenceManager();
        pm.makePersistent(p);
    }
    
}
