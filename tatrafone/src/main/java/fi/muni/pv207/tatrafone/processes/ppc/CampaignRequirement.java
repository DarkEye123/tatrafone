package fi.muni.pv207.tatrafone.processes.ppc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CampaignRequirement implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Only Czech language?")
   private java.lang.String czechReq;
   @org.kie.api.definition.type.Label("Deadline")
   private java.util.Date deadline;
   @org.kie.api.definition.type.Label("Name of the campaign")
   private java.lang.String campaignName;
   @org.kie.api.definition.type.Label("Motto of the campaign")
   private java.lang.String motto;

   @org.kie.api.definition.type.Label("Result of the campaign")
   private java.lang.Boolean result;

   @org.kie.api.definition.type.Label("Campaign provider")
   private java.lang.String provider;

   @org.kie.api.definition.type.Label(value = "Cost in Millions of Euros")
   private java.lang.Double cost;

   @org.kie.api.definition.type.Label(value = "Income in Millions of Euro")
   private java.lang.Double income;

   public CampaignRequirement()
   {
   }

   public java.lang.String getCzechReq()
   {
      return this.czechReq;
   }

   public void setCzechReq(java.lang.String czechReq)
   {
      this.czechReq = czechReq;
   }

   public java.util.Date getDeadline()
   {
      return this.deadline;
   }

   public void setDeadline(java.util.Date deadline)
   {
      this.deadline = deadline;
   }

   public java.lang.String getCampaignName()
   {
      return this.campaignName;
   }

   public void setCampaignName(java.lang.String campaignName)
   {
      this.campaignName = campaignName;
   }

   public java.lang.String getMotto()
   {
      return this.motto;
   }

   public void setMotto(java.lang.String motto)
   {
      this.motto = motto;
   }

   public java.lang.Boolean getResult()
   {
      return this.result;
   }

   public void setResult(java.lang.Boolean result)
   {
      this.result = result;
   }

   public java.lang.String getProvider()
   {
      return this.provider;
   }

   public void setProvider(java.lang.String provider)
   {
      this.provider = provider;
   }

   public java.lang.Double getCost()
   {
      return this.cost;
   }

   public void setCost(java.lang.Double cost)
   {
      this.cost = cost;
   }

   public java.lang.Double getIncome()
   {
      return this.income;
   }

   public void setIncome(java.lang.Double income)
   {
      this.income = income;
   }

   public CampaignRequirement(java.lang.String czechReq, java.util.Date deadline,
         java.lang.String campaignName, java.lang.String motto,
         java.lang.Boolean result, java.lang.String provider,
         java.lang.Double cost, java.lang.Double income)
   {
      this.czechReq = czechReq;
      this.deadline = deadline;
      this.campaignName = campaignName;
      this.motto = motto;
      this.result = result;
      this.provider = provider;
      this.cost = cost;
      this.income = income;
   }

}