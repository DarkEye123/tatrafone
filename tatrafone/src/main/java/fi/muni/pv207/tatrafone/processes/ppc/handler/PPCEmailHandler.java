package fi.muni.pv207.tatrafone.processes.ppc.handler;

import fi.muni.pv207.tatrafone.processes.alliancemembership.ClientRequest;
import fi.muni.pv207.tatrafone.processes.ppc.CampaignRequirement;
import org.jbpm.process.instance.impl.demo.SystemOutWorkItemHandler;
import org.jbpm.process.workitem.email.Email;
import org.jbpm.process.workitem.email.EmailWorkItemHandler;
import org.jbpm.process.workitem.email.SendHtml;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;

import java.util.HashMap;

/**
 * @author darkeye
 */
public class PPCEmailHandler extends EmailWorkItemHandler {

    public PPCEmailHandler(String host, String port, String userName, String password) {
        super(host, port, userName, password);
    }

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        if(this.getConnection() == null) {
            throw new IllegalArgumentException("Connection not initialized for Email");
        } else {
            CampaignRequirement requirement = (CampaignRequirement) workItem.getParameter("Campaign");
            System.out.println("requirement " + requirement);
            System.out.println("requirement email " + requirement.getEmail());
            workItem.getParameters().put("To", requirement.getEmail());
            try {
                Email e = createEmail(workItem, this.getConnection());
                SendHtml.sendHtml(e, this.getDebugFlag(workItem));
                if(manager != null) {
                    manager.completeWorkItem(workItem.getId(), new HashMap<String, Object>());
                }
            } catch (Exception var4) {
                this.handleException(var4);
            }
        }
    }
}
