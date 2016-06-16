package fi.muni.pv207.tatrafone.processes.ppc.handler;

import fi.muni.pv207.tatrafone.processes.connection_builders.evaluators.Evaluator;
import fi.muni.pv207.tatrafone.processes.ppc.CampaignRequirement;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import java.util.HashMap;

/**
 * Created by darkeye on 15/06/16.
 */
public class ExternalEvaluationHandler implements WorkItemHandler {


    Evaluator evaluator = new Evaluator();

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        String estimation = (String) workItem.getParameter("estimation");
        CampaignRequirement campaignRequest = (CampaignRequirement) workItem.getParameter("Campaign");

        String[] values = estimation.split(":"); // message comes like 25.8:29.3
        Double cost = Double.parseDouble(values[0]);
        Double income = Double.parseDouble(values[1]);

        if (campaignRequest.getCost() == null) {
            campaignRequest.setCost(0.);
            campaignRequest.setIncome(0.);
        }
        campaignRequest.setCost(campaignRequest.getCost() + cost);
        campaignRequest.setIncome(campaignRequest.getIncome() + income); // adding

        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", evaluator.isDoingWell(cost, income));
        resultMap.put("Campaign", campaignRequest);
        manager.completeWorkItem(workItem.getId(), resultMap);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }
}
