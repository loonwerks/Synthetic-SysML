// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c58cc39d1171_2_Valid {
  @pure def check(
      defrostrequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.DefrostRequest.Type,
      glazingcondition: equiv_shared_0.HVAC_Energy_Interface_Supervisor.GlazingCondition.Type,
      visibilitydemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(visibilitydemand))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier_GumboX.inititialize_IEP_Post(visibilitydemand))) & T))
  }
}
