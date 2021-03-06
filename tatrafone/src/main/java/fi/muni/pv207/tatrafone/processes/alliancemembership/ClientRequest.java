package fi.muni.pv207.tatrafone.processes.alliancemembership;

/**
 * @author darkeye
 */

@org.kie.api.definition.type.Label("Request from Client")
@org.kie.api.definition.type.Description("Every prospective client (partner, distributor) that wants to become a member of the alliance must fill request on the alliance portal.")
public class ClientRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String companyName;
   private java.lang.String companyDescription;
   private String coopGain;
   @org.kie.api.definition.type.Label(value = "Reason of the Decision")
   private java.lang.String evaluationOfPartnership;

   private java.lang.String email;

   public ClientRequest()
   {
   }

   public java.lang.String getCompanyName()
   {
      return this.companyName;
   }

   public void setCompanyName(java.lang.String companyName)
   {
      this.companyName = companyName;
   }

   public java.lang.String getCompanyDescription()
   {
      return this.companyDescription;
   }

   public void setCompanyDescription(java.lang.String companyDescription)
   {
      this.companyDescription = companyDescription;
   }

   public java.lang.String getCoopGain()
   {
      return this.coopGain;
   }

   public void setCoopGain(java.lang.String coopGain)
   {
      this.coopGain = coopGain;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.String getEvaluationOfPartnership()
   {
      return this.evaluationOfPartnership;
   }

   public void setEvaluationOfPartnership(java.lang.String evaluationOfPartnership)
   {
      this.evaluationOfPartnership = evaluationOfPartnership;
   }

   public ClientRequest(java.lang.String companyName,
         java.lang.String companyDescription, java.lang.String coopGain,
         java.lang.String email, String evaluationOfPartnership)
   {
      this.companyName = companyName;
      this.companyDescription = companyDescription;
      this.coopGain = coopGain;
      this.email = email;
      this.evaluationOfPartnership = evaluationOfPartnership;
   }

}