// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_edeb196dd1f6_2_Valid {
  @pure def check(
      factstoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts,
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_Candidate_GumboX.compute_CEP_Post(reportin, factstoadvisory, factstoeligibility, faulttoaggregation))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_GumboX.compute_CEP_Post(reportin, factstoadvisory, factstoeligibility, faulttoaggregation))) & T))
  }
}
