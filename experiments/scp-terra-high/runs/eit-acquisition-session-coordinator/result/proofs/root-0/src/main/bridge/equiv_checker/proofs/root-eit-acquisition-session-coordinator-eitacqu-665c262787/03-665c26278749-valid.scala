// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_665c26278749_3_Valid {
  @pure def check(
      acquisitioncommand: equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
