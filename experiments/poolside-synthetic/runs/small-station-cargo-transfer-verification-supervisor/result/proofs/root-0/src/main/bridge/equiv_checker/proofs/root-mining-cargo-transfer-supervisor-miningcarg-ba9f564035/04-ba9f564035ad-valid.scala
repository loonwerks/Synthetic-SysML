// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ba9f564035ad_4_Valid {
  @pure def check(
      dockingassessment: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type,
      dockingsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_GumboX.inititialize_IEP_Post(dockingassessment))) ___>: (T)) & T))
  }
}
