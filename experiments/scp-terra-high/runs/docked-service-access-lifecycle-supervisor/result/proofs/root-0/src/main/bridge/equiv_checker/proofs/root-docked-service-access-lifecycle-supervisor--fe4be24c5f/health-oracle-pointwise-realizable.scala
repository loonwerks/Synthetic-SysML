// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_fe4be24c5f94_Oracle_Pointwise_Realizable {
  @pure def check(
      pilotintent: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.NO_ACTION)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.DOCK_REQUEST)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.UNDOCK_REQUEST)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.RESET_REQUEST)) |
        (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.INTENT_FAULT)))))
  }
}
