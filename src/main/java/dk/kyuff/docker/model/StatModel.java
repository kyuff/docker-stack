package dk.kyuff.docker.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class StatModel {

    public StatModel(int host, long hitCount) {
        this.host = host;
        this.hitCount = hitCount;
    }

    @Id
    private int host;
    private long hitCount;

    public int getHost() {
        return host;
    }

    public void setHost(int host) {
        this.host = host;
    }

    public long getHitCount() {
        return hitCount;
    }

    public void setHitCount(long hitCount) {
        this.hitCount = hitCount;
    }
}
