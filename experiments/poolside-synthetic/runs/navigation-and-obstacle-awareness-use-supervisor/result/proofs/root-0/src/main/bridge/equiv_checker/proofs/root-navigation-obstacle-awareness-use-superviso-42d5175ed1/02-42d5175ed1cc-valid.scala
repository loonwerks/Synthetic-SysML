// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_42d5175ed1cc_2_Valid {
  @pure def check(
      acceptedaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      navigationbasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type,
      navigationusedirective: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.Type,
      obstacleawarenessnotice: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type,
      postrecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      supervisionstatus: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner_GumboX.compute_CEP_Post(acceptedaction, navigationbasis, postrecoveryphase, navigationusedirective, obstacleawarenessnotice, supervisionstatus))) & T))
  }
}
