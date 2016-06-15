package fi.muni.pv207.tatrafone.rest_services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * @author darkeye
 */

@Path("/")
public class CampaignStatusAnalyser {

    private static final Logger logger = LoggerFactory.getLogger(CampaignStatusAnalyser.class);
    public static final double BREAK_POINT = 0.2f;

    @GET
    @Path("analyser")
    public Response analyseStatus(@QueryParam("cost") Double cost, @QueryParam("income") Double income) {
        logger.info("cost=" + cost + " income=" + income);

        return (income - cost) > BREAK_POINT  ? Response.ok().build() :
                Response.status(Response.Status.FORBIDDEN).build();
    }
}
