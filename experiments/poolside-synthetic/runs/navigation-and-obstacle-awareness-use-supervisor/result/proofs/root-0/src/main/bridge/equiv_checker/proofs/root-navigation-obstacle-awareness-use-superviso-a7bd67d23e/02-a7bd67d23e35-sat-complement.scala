// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a7bd67d23e35_2_Complement {
  @pure def check(
      constraintproposal: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type,
      outcomeaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      prerecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      recoveryaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      supervisionevent: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.EventPriorityArbiter_supervisorProcess_eventPriorityArbiter_GumboX.compute_CEP_Post(constraintproposal, prerecoveryphase, supervisionevent, outcomeaction, recoveryaction))) & T)))
  }
}
