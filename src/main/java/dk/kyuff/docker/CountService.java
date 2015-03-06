package dk.kyuff.docker;

import dk.kyuff.docker.model.StatModel;

import java.util.List;

public interface CountService {

    int getIdNumber();

    String createAccessLog();

    List<StatModel> getStats();

}
