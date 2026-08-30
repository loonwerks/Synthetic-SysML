// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d8b1d8b07ef6_1_Valid {
  @pure def check(
      constraintproposal: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type,
      outcomeaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      prerecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      recoveryaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      supervisionevent: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
