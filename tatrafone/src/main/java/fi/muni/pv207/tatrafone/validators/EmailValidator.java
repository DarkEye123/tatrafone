package fi.muni.pv207.tatrafone.validators;
import com.squareup.okhttp.OkHttpClient ;

import java.io.IOException;

/**
 * Created by darkeye on 11/06/16.
 */
public class EmailValidator {
    private String port="9080";
    private String url="/services/email";
    private com.squareup.okhttp.OkHttpClient client = new com.squareup.okhttp.OkHttpClient();

    public EmailValidator() {

    }

    public EmailValidator(String port, String url) {
        this.port = port;
        this.url = url;
    }

    public boolean validate(String email) {

        com.squareup.okhttp.Request request = new com.squareup.okhttp.Request.Builder()
                .url("http://localhost:" + port + url + "?email="+ email)
                .build();

        com.squareup.okhttp.Response response = null;
        try {
            response = client.newCall(request).execute();
            response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response != null && response.isSuccessful())
            return true;

        return false;
    }
}
