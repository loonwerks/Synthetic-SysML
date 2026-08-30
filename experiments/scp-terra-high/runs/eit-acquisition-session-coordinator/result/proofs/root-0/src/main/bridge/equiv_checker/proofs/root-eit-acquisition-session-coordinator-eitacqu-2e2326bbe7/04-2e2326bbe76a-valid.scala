// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2e2326bbe76a_4_Valid {
  @pure def check(
      arbitrationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ArbitrationDecision,
      eligibilityenvelope: equiv_shared_0.EIT_Acquisition_Session_Coordinator.EligibilityEnvelope,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot,
      monitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type,
      preparationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot,
      committedmonitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_GumboX.inititialize_IEP_Post(committedmonitoringstate, monitoringdecision, monitoringstate))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_Candidate_GumboX.inititialize_IEP_Post(committedmonitoringstate, monitoringdecision, monitoringstate))) & T))
  }
}
