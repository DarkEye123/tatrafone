package fi.muni.pv207.tatrafone.processes.aliancemembership.handler;
import fi.muni.pv207.tatrafone.processes.aliancemembership.ClientRequest;
import fi.muni.pv207.tatrafone.validators.EmailValidator;
import org.kie.api.runtime.process.EventListener;
import org.kie.api.task.TaskEvent;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.api.runtime.KieRuntime;

import java.util.HashMap;

/**
 * Created by darkeye on 12/06/16.
 */
public class ValidateEmailServiceHandler implements WorkItemHandler {

    private EmailValidator validateEmail = new EmailValidator("9080", "/services/email");

    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
        ClientRequest request = (ClientRequest) workItem.getParameter("ClientDescription");
        Boolean validation_success = validateEmail.validate(request.getEmail());
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("Result", validation_success);
        workItemManager.completeWorkItem(workItem.getId(), resultMap);
        if (validation_success.equals(Boolean.FALSE))
            throw new Error("invalid_email");
        return;
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }
}
