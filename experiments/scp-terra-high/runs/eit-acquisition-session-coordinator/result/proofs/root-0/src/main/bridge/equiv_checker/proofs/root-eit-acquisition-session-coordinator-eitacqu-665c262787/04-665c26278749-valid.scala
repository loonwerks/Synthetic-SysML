// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_665c26278749_4_Valid {
  @pure def check(
      acquisitioncommand: equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_GumboX.compute_CEP_Post(monitoringdecision, acquisitioncommand))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_Candidate_GumboX.compute_CEP_Post(monitoringdecision, acquisitioncommand))) & T))
  }
}
