// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fe4be24c5f94_2_Complement {
  @pure def check(
      pilotintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type,
      qualifiedintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.inititialize_IEP_Post(qualifiedintent))) & T)))
  }
}
