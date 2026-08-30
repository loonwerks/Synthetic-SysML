// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6bcc82f3998f_4_Valid {
  @pure def check(
      factstoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts,
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_GumboX.inititialize_IEP_Post(factstoadvisory, factstoeligibility, faulttoaggregation))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleContextApplicabilityOwner_chargeQualificationProcess_lifecycleContextApplicabilityOwner_Candidate_GumboX.inititialize_IEP_Post(factstoadvisory, factstoeligibility, faulttoaggregation))) & T))
  }
}
