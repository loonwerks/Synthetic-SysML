// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_14d1d3efa56c_1_Valid {
  @pure def check(
      readinesscontext: equiv_shared_0.Cabin_Air_Treatment_Supervisor.ReadinessContext.Type,
      recoverygate: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type,
      requestintent: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RequestIntent.Type,
      recoverymemory: equiv_shared_0.Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
