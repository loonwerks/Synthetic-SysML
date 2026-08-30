// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_193014fde21e_Candidate_Pointwise_Realizable {
  @pure def check(
      defrostrequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.DefrostRequest.Type,
      glazingcondition: equiv_shared_0.HVAC_Energy_Interface_Supervisor.GlazingCondition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Candidate_GumboX.compute_CEP_Post(defrostrequest, glazingcondition, equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.None)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Candidate_GumboX.compute_CEP_Post(defrostrequest, glazingcondition, equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Candidate_GumboX.compute_CEP_Post(defrostrequest, glazingcondition, equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid)))))
  }
}
