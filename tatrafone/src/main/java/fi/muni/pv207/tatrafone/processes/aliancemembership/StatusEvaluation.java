package fi.muni.pv207.tatrafone.processes.aliancemembership;

/**
 * @author darkeye
 */

@org.kie.api.definition.type.Label("Status Evaluation")
@org.kie.api.definition.type.Description("Evaluation of the client from the Sales Representative")
public class StatusEvaluation extends ClientRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Decision")
   private java.lang.Boolean decision;
   @org.kie.api.definition.type.Label(value = "Reason of the Decision")
   private java.lang.String reasonOfDecision;

   public StatusEvaluation()
   {
   }

   public java.lang.Boolean getDecision()
   {
      return this.decision;
   }

   public void setDecision(java.lang.Boolean decision)
   {
      this.decision = decision;
   }

   public java.lang.String getReasonOfDecision()
   {
      return this.reasonOfDecision;
   }

   public void setReasonOfDecision(java.lang.String reasonOfDecision)
   {
      this.reasonOfDecision = reasonOfDecision;
   }

   public StatusEvaluation(java.lang.Boolean decision,
         java.lang.String reasonOfDecision)
   {
      this.decision = decision;
      this.reasonOfDecision = reasonOfDecision;
   }

}