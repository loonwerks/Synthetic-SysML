// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_efd67fdda2cc_2_Complement {
  @pure def check(
      request_levels: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels,
      request_to_authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts,
      request_to_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts,
      previousoff: B,
      previousreturn: B,
      previousstart: B): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_GumboX.inititialize_IEP_Post(previousoff, previousreturn, previousstart, request_to_authorization, request_to_lifecycle))) & T)))
  }
}
