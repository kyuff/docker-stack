package dk.kyuff.docker;


import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AppProducer {

    @PersistenceContext
    @Produces
    EntityManager entityManager;
}
