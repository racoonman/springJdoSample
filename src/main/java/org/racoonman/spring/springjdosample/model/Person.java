package org.racoonman.spring.springjdosample.model;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 *
 * @author daniel
 */
@PersistenceCapable
public class Person {
    
    @Persistent
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
