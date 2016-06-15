package fi.muni.pv207.tatrafone.rest_services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.dropwizard.Application;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author darkeye
 */
public class Main extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        Main app = new Main();
        app.run(args);
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        // json
        configureObjectMapper(environment.getObjectMapper());

        // rest configuration
        addRestServices(environment.jersey(), configuration);
    }

    private void addRestServices(JerseyEnvironment jerseyEnvironment, AppConfiguration configuration) {
        final EmailService validateRestService = new EmailService();
        final CampaignStatusEvaluator campaingEvaluator = new CampaignStatusEvaluator();
        final CampaignStatusAnalyser campaignAnalyzator = new CampaignStatusAnalyser();
        jerseyEnvironment.register(validateRestService);
        jerseyEnvironment.register(campaingEvaluator);
        jerseyEnvironment.register(campaignAnalyzator);
    }

    @Override
    public String getName() {
        return "REST deployment for pv207";
    }

    public static void configureObjectMapper(ObjectMapper mapper) {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
        mapper.disable(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY); // skip false :(
        mapper.enable(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }
}
