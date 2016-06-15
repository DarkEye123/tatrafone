package fi.muni.pv207.tatrafone.processes.ppc.handler;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

/**
 * Created by darkeye on 15/06/16.
 */
public class ExternalAnalysisHandler implements WorkItemHandler {


    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        Double cost = (Double)workItem.getParameter("i_cost");
        Double income = (Double)workItem.getParameter("i_income");
        Boolean doingWell = false;



    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }
}
