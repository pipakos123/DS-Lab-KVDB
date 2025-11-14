package gr.hua.dit.officehours.core.repository;

import gr.hua.dit.officehours.core.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing {@link Person} entity
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}

