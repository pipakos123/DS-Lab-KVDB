package gr.hua.dit.officehours.web;

import gr.hua.dit.officehours.core.model.Person;
import gr.hua.dit.officehours.core.model.PersonType;
import gr.hua.dit.officehours.core.repository.PersonRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TestController {

    private final PersonRepository personRepository;

    public TestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    /**
     *  REST endpoint for testing.
     */
    @GetMapping(value = "test", produces = MediaType.TEXT_PLAIN_VALUE)
    public String test() {
        // Example 1: create Person.
        Person person = new Person();
        person.setId(null); // auto-generated
        person.setHuaId("it000001");
        person.setType(PersonType.STUDENT);
        person.setFirstName("Parla");
        person.setLastName("Pipakos");
        person.setEmailAddress("parlapipakos123@hua.com");
        person.setMobilePhoneNumber("+306900000000");
        person.setPasswordHash("<invalid>");
        person.setCreatedAt(Instant.now()); // just now.

        person = this.personRepository.save(person);

        return person.toString();
    }
}
