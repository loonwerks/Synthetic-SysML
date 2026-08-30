// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d3ad1054b2fa_4_Valid {
  @pure def check(
      pilotintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type,
      qualifiedintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.compute_CEP_Post(pilotintent, qualifiedintent))) ___>: (T)) & T))
  }
}
