// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8842256eb42a_2_Complement {
  @pure def check(
      acceptedaction: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type,
      postrecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      prerecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type,
      committedrecoveryphase: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner_GumboX.inititialize_IEP_Post(committedrecoveryphase, postrecoveryphase, prerecoveryphase))) & T)))
  }
}
