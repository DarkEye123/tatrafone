package fi.muni.pv207.tatrafone.processes.ppc.handler;

import fi.muni.pv207.tatrafone.processes.ppc.CampaignRequirement;
import fi.muni.pv207.tatrafone.processes.ppc.database.CampaignDatabase;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

/**
 * Created by darkeye on 16/06/16.
 */
public class CampaignDatabaseHandler implements WorkItemHandler {



    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        CampaignRequirement campaignRequest = (CampaignRequirement) workItem.getParameter("Campaign");
        CampaignDatabase.addCostIncome(campaignRequest.getCost(), campaignRequest.getIncome());
        manager.completeWorkItem(workItem.getId(), null);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }
}
