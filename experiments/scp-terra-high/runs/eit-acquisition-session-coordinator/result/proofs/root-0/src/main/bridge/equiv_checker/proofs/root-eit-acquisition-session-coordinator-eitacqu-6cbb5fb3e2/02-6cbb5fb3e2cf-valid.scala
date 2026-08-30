// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6cbb5fb3e2cf_2_Valid {
  @pure def check(
      acquisitioncommand: equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommand.Type,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_Candidate_GumboX.inititialize_IEP_Post(acquisitioncommand))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy_GumboX.inititialize_IEP_Post(acquisitioncommand))) & T))
  }
}
