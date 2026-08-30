// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fc8032906840_3_Valid {
  @pure def check(
      readinesscontext: equiv_shared_0.Cabin_Air_Treatment_Supervisor.ReadinessContext.Type,
      recoverygate: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      in_recoverymemory: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type,
      recoverymemory: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
