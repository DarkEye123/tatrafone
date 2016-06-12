package fi.muni.pv207.tatrafone.processes.alliancemembership.database;

import fi.muni.pv207.tatrafone.processes.alliancemembership.ClientRequest;

import java.util.ArrayList;

/**
 * Created by darkeye on 12/06/16.
 */
public class AllianceDatabase {

    private ArrayList<ClientRequest> database = new ArrayList<ClientRequest>();

    public AllianceDatabase() {
        ClientRequest request = new ClientRequest("Tojota", "We made cars", "You will make money", "tojota@tojota.com"); //just an example
    }


    public ArrayList<ClientRequest> getDatabase() {
        return database;
    }

    public void addClient(ClientRequest request) {
        this.database.add(request);
    }
}
