// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f56b98a1a8d4_2_Valid {
  @pure def check(
      arbitrationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ArbitrationDecision,
      eligibilityenvelope: equiv_shared_0.EIT_Acquisition_Session_Coordinator.EligibilityEnvelope,
      monitoringdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringDecisionSnapshot,
      monitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type,
      preparationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot,
      in_committedmonitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type,
      committedmonitoringstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_Candidate_GumboX.compute_CEP_Post(in_committedmonitoringstate, committedmonitoringstate, arbitrationdecision, eligibilityenvelope, preparationdecision, monitoringdecision, monitoringstate))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.MonitoringStateGovernor_acquisitionCoordinationProcess_monitoringStateGovernor_GumboX.compute_CEP_Post(in_committedmonitoringstate, committedmonitoringstate, arbitrationdecision, eligibilityenvelope, preparationdecision, monitoringdecision, monitoringstate))) & T))
  }
}
