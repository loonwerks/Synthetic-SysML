// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_f27a68d0066e_Candidate_Pointwise_Realizable {
  @pure def check(
      charger_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargerEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.compute_CEP_Post(charger_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.READY_NONE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.compute_CEP_Post(charger_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_INVALID)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.compute_CEP_Post(charger_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_STALE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.compute_CEP_Post(charger_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_CONNECTED_IDLE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.compute_CEP_Post(charger_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.NOT_READY_CHARGING_OR_UNKNOWN)))))
  }
}
