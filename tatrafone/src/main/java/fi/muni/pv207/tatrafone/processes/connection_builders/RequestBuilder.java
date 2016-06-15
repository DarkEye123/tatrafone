package fi.muni.pv207.tatrafone.processes.connection_builders;

import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;

/**
 * Created by darkeye on 15/06/16.
 */
public class RequestBuilder {
    protected String port="9080";
    protected String url="/services/";
    private OkHttpClient client = new OkHttpClient();

    public RequestBuilder(String url) {
        this.url = this.url + url;
    }

    public boolean buildRequest(String url) {

        com.squareup.okhttp.Request request = new com.squareup.okhttp.Request.Builder()
                .url(url)
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
