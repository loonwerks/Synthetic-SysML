// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_397f6e58e926_2_Valid {
  @pure def check(
      framedelivery: equiv_shared_0.EIT_Acquisition_Session_Coordinator.FrameDelivery.Type,
      impedanceframe: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ImpedanceFrameObservation.Type,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot,
      sessionstatus: equiv_shared_0.EIT_Acquisition_Session_Coordinator.SessionStatus): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_Candidate_GumboX.inititialize_IEP_Post(framedelivery, sessionstatus))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.SessionPublicationPolicy_acquisitionCoordinationProcess_sessionPublicationPolicy_GumboX.inititialize_IEP_Post(framedelivery, sessionstatus))) & T))
  }
}
