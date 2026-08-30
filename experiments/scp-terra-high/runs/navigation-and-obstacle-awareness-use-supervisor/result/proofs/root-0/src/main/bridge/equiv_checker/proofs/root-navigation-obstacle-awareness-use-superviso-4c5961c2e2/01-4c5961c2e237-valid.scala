// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4c5961c2e237_1_Valid {
  @pure def check(
      acceptedaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      postrecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      prerecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      in_committedrecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      committedrecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
