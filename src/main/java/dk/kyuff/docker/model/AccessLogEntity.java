package dk.kyuff.docker.model;

import javax.persistence.*;

@Entity
@Table(name = "accessLog")
public class AccessLogEntity {
    @Id
    @SequenceGenerator(name = "accesslog_id_seq",
            sequenceName = "accesslog_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "accesslog_id_seq")
    private long id;

    private int hostId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    @Override
    public String toString() {
        return "AccessLogEntity{" +
                "id=" + id +
                ", hostId=" + hostId +
                '}';
    }
}
