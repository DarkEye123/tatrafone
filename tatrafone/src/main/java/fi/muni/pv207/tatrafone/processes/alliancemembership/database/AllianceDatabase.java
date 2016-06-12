package fi.muni.pv207.tatrafone.processes.alliancemembership.database;

import fi.muni.pv207.tatrafone.processes.alliancemembership.ClientRequest;

import java.util.ArrayList;

/**
 * Created by darkeye on 12/06/16.
 */
public class AllianceDatabase {

    private static ArrayList<ClientRequest> database = new ArrayList<ClientRequest>();
    private static ClientRequest request = new ClientRequest("Tojota", "We made cars", "You will make money", "tojota@tojota.com", "Yep, this is good partner"); //just an example

    static {
        database.add(request);
    }


    public static ArrayList<ClientRequest> getDatabase() {
        return database;
    }

    public static ClientRequest getClientbyName(String name) {
        for (ClientRequest req : database) {
            if (req.getCompanyName().equals(name))
                return req;
        }
        return null;
    }

    public static ClientRequest getClientbyEmail(String email) {
        for (ClientRequest req : database) {
            if (req.getEmail().equals(email))
                return req;
        }
        return null;
    }

    public static void addClient(ClientRequest request) {
        database.add(request);
    }
}
