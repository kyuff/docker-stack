package dk.kyuff.docker;

import dk.kyuff.docker.model.AccessLogEntity;
import dk.kyuff.docker.model.StatModel;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Random;

@Singleton
public class CountServiceImpl implements CountService {

    private int idNumber;

    @Inject
    EntityManager entityManager;

    @Override
    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String createAccessLog() {
        AccessLogEntity log = new AccessLogEntity();
        log.setHostId(idNumber);
        entityManager.persist(log);
        return log.toString();
    }

    @Override
    public List<StatModel> getStats() {
        Query query = entityManager.createQuery("SELECT new dk.kyuff.docker.model.StatModel(a.hostId, COUNT(a.hostId)) FROM AccessLogEntity a GROUP BY a.hostId", StatModel.class);
        return (List<StatModel>) query.getResultList();
    }

    @PostConstruct
    private void postConstruct() {
        Random random = new Random();
        idNumber = random.nextInt(1000);
    }
}
