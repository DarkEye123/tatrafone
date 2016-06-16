package fi.muni.pv207.tatrafone.processes.connection_builders.analyzators;
import fi.muni.pv207.tatrafone.processes.connection_builders.RequestBuilder;

/**
 * Created by darkeye on 11/06/16.
 */
public class Analyser extends RequestBuilder {
    public Analyser() {
        super("analyser");
    }

    public boolean isCampaignSuccessful(Double cost, Double income) {
        String url = "http://localhost:" + this.port + this.url + "?cost="+ cost +"&income=" + income;
        return buildRequest(url);
    }
}
