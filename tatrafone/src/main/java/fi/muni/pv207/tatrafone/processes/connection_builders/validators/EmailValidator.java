package fi.muni.pv207.tatrafone.processes.connection_builders.validators;
import com.squareup.okhttp.OkHttpClient;
import fi.muni.pv207.tatrafone.processes.connection_builders.RequestBuilder;

import java.io.IOException;

/**
 * Created by darkeye on 11/06/16.
 */
public class EmailValidator extends RequestBuilder {
    public EmailValidator() {
        super("email");
    }

    public boolean validate(String email) {
        String url = "http://localhost:" + this.port + this.url + "?email="+ email;
        return buildRequest(url);
    }
}
