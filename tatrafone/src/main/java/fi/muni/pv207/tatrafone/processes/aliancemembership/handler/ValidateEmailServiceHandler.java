package fi.muni.pv207.tatrafone.processes.aliancemembership.handler;
import fi.muni.pv207.tatrafone.validators.EmailValidator;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

/**
 * Created by darkeye on 11/06/16.
 */
public class ValidateEmailServiceHandler implements WorkItemHandler {

    private EmailValidator validateEmail = new EmailValidator("9080", "/services/email");

    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }
}
