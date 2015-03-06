package dk.kyuff.docker;


import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Produces("text/plain")
public class Resource {

    @Inject
    CountService countService;

    @GET
    @Transactional
    public String read() {
        StringBuilder sb = new StringBuilder();
        sb.append("Service ID: ");
        sb.append(countService.getIdNumber() + "\n");

        sb.append(countService.createAccessLog() + "\n");

        sb.append("\n");
        sb.append("Stats:\n");
        countService.getStats().stream()
                .map(stat -> stat.getHost() + ": " + stat.getHitCount() + "\n")
                .forEach(sb::append);

        return sb.toString();
    }

}
