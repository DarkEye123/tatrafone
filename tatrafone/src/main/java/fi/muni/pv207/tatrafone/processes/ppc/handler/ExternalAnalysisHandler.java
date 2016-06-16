package fi.muni.pv207.tatrafone.processes.ppc.handler;

import fi.muni.pv207.tatrafone.processes.connection_builders.analyzators.Analyser;
import fi.muni.pv207.tatrafone.processes.ppc.CampaignRequirement;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import java.util.HashMap;

/**
 * Created by darkeye on 15/06/16.
 */
public class ExternalAnalysisHandler implements WorkItemHandler {

    Analyser analyser = new Analyser();

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        CampaignRequirement campaignRequest = (CampaignRequirement) workItem.getParameter("Campaign");
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", analyser.isCampaignSuccessful(campaignRequest.getCost(), campaignRequest.getIncome()));
        manager.completeWorkItem(workItem.getId(), resultMap);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        
    }
}
