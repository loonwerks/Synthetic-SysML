// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_69eefd456b49_2_Valid {
  @pure def check(
      charger_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargerEvidence,
      charging_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Candidate_GumboX.inititialize_IEP_Post(charging_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_GumboX.inititialize_IEP_Post(charging_assessment))) & T))
  }
}
