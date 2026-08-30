// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_be9c1c359d79_3_Valid {
  @pure def check(
      framedelivery: equiv_shared_0.EIT_Acquisition_Session_Coordinator.FrameDelivery.Type,
      impedanceframe: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot,
      sessionstatus: equiv_shared_0.EIT_Acquisition_Session_Coordinator.SessionStatus): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
