package fi.muni.pv207.tatrafone.processes.ppc.handler;

import fi.muni.pv207.tatrafone.processes.connection_builders.analyzators.Analyser;
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
        String estimation = (String) workItem.getParameter("estimation");
        String[] values = estimation.split(":"); // message comes like 25.8:29.3
        Double cost = Double.parseDouble(values[0]);
        Double income = Double.parseDouble(values[1]);
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", analyser.isCampaignSuccessful(cost, income));
        manager.completeWorkItem(workItem.getId(), resultMap);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        
    }
}
