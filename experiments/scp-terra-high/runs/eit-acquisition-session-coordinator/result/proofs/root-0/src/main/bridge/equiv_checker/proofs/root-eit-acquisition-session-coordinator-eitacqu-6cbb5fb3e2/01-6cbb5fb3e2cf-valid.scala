// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6cbb5fb3e2cf_1_Valid {
  @pure def check(
      acquisitioncommand: equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
