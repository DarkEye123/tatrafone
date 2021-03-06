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
public class EmailService {

    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    @GET
    @Path("email")
    public Response validateEmail(@QueryParam("email") String email) {
        logger.info("email=" + email);

        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email) ? Response.ok().build() :
                Response.status(Response.Status.FORBIDDEN).build();
    }
}
