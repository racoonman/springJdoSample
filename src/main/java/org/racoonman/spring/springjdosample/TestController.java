package org.racoonman.spring.springjdosample;

import org.racoonman.spring.springjdosample.dao.HutanDao;
import org.racoonman.spring.springjdosample.model.Person;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daniel
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    HutanDao daoService;

    @RequestMapping("/test")
    public String index() {
        StringBuilder sb = new StringBuilder();
        for (Person p : daoService.getPersons()) {
            sb.append(
                    p.getName()).append(", ");
        }

        return sb.toString();
    }

    @RequestMapping("/new")
    public String newPerson() {
        Person p = new Person();
        p.setName(UUID.randomUUID().toString());
        daoService.savePerson(p);
        return "OK :)";
    }

}
