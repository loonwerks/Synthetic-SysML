// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_7da1b8ebee20_Oracle_Pointwise_Realizable {
  @pure def check(
      dockingsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_GumboX.compute_CEP_Post(dockingsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.InvalidDocking)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_GumboX.compute_CEP_Post(dockingsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.NotDockedAssessment)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner_GumboX.compute_CEP_Post(dockingsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.DockingAssessment.DockedAssessment)))))
  }
}
