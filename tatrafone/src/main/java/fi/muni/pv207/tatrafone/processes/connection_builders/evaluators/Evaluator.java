package fi.muni.pv207.tatrafone.processes.connection_builders.evaluators;
import fi.muni.pv207.tatrafone.processes.connection_builders.RequestBuilder;

/**
 * Created by darkeye on 11/06/16.
 */
public class Evaluator extends RequestBuilder {
    public Evaluator() {
        super("evaluator");
    }

    public boolean isDoingWell(Double cost, Double income) {
        String url = "http://localhost:" + this.port + this.url + "?cost="+ cost +"?income=" + income;
        return buildRequest(url);
    }
}
