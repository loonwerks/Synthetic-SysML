// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7da1b8ebee20_2_Complement {
  @pure def check(
      dockingassessment: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.Type,
      dockingsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_GumboX.compute_CEP_Post(dockingsample, dockingassessment))) & T)))
  }
}
