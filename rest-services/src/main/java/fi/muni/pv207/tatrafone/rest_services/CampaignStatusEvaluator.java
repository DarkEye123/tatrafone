package fi.muni.pv207.tatrafone.rest_services;

import org.apache.commons.validator.routines.EmailValidator;
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
public class CampaignStatusEvaluator {

    private static final Logger logger = LoggerFactory.getLogger(CampaignStatusEvaluator.class);

    @GET
    @Path("evaluator")
    public Response evaluateStatus(@QueryParam("cost") Double cost, @QueryParam("income") Double income) {
        logger.info("cost=" + cost + " income=" + income);

        return income > cost ? Response.ok().build() :
                Response.status(Response.Status.FORBIDDEN).build();
    }
}
