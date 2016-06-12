package fi.muni.pv207.tatrafone.processes.alliancemembership.handler;

import fi.muni.pv207.tatrafone.processes.alliancemembership.ClientRequest;
import fi.muni.pv207.tatrafone.processes.alliancemembership.database.AllianceDatabase;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

/**
 * Created by darkeye on 12/06/16.
 */
public class StoreClientServiceHandler implements WorkItemHandler{

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        ClientRequest request = (ClientRequest) workItem.getParameter("ClientDescription");
        AllianceDatabase.addClient(request);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }
}
