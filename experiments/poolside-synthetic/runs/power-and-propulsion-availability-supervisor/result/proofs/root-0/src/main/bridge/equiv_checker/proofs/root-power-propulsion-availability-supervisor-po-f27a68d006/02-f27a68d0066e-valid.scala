// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f27a68d0066e_2_Valid {
  @pure def check(
      charger_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargerEvidence,
      charging_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.compute_CEP_Post(charger_evidence, charging_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_GumboX.compute_CEP_Post(charger_evidence, charging_assessment))) & T))
  }
}
